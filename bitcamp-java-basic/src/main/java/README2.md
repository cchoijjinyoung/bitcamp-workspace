# 즉 빈 생성 후에 어떤 작업을 수행할 객체를 만들고 싶다면?

# 의존객체 자동 주입방법.
 - BeanPostProcessor  
 - 디스페처서블릿이 만들어질때 자동생성된다.
 - 생성된 객체에서 세터매서드/필드를 찾고 찾은 곳에서 @Autowired를 찾아서 객체를 자동생성.
 
 @Autowired는 셋터뿐만아니라 필드에 붙어도 가능.
 단, 필드 ex)engine 에 직접적으로 붙이는 방식은 private 이라도 적용되는데,
 이는 기존의 캡슐화의 개념을 위배하므로, 객체지향을 파괴하는 방식이라 불리기도한다.
 (* 현재 실무에서 가장 많이 쓰이는 방식이다.)
 
 1. Car(engine engine) 에 Autowired를 붙이거나(안붙여도된다.)
  - 안붙여도되는 이유는 이 생성자를 생성해주면 포스트프로세서가 알아서 해준다.
 2. 인스턴스필드 앞에 Autowired 붙이거나,
 이 둘중방법을 선택해서 쓴다.
 
# required 를 false로 설정하면 해당 객체가 없더라도 오류발생 x
@Autowired(required = false)

xml에 의존객체를 생성 x
@Autowired 의 requierd 값은 기본이 true.
즉 의존객체 주입이 필수이다.
```
@Autowired  //required = true 상태이다.
private Engine engine;
```
를 하면 아니 객체를 안만들었잖아! 하고 예외발생.
허나 required = false로 지정해주면, 해당 객체가 없더라도 오류가 발생하지 않는다.

#깜짝 에러.. -> url(xsd)을 http => https 로 변경하자. 2020/6월 이후로 바뀜.

#Qualifier 이란?
엔진을 꽂고싶은데. xml에 적혀있기로는 생성된 엔진 객체가 e1, e2 두개네? 뭘 꽂아야돼? 일단 에러줄게 -,-;
아 미안해! 내가 알려줄게!!! @Qualifire("e2") -> e2를 꽂아줘.
```
@Autowired
@Qualifier("e2") // 물론 value는 생략됐다. (value = "e2")
private engine engine;
```

#<annotation-config> 이란?
아니 근데 불편하지 않냐.. 언제 에노테이션 마다 <bean 으로 다 등록해 ??
<context:annotation-config/> 이 태그하나로 퉁치자.
내부적으로 애노테이션이랑 관련된 객체 생성해!
- 기본적으로 4개 생성한다.
- Autowired.., Configuration.., CommonAnnot.., EventListener.,

#@Autowired + Qualifier = Resource
- 단, 사용하려면 
build.gradle 에 implementation 'javax.annotation:javax.annotation-api:1.3.2' 추가.

#@Component
안타깝게도 지금까지 bean 객체생성에는 <bean id="" class=""/> 을 사용했다.

- 스프링 IoC 컨테이너는 이 애노테이션이 붙은 클래스에 대해 객체를 자동 생성한다.
- 단 이 애노테이션을 처리할 객체를 등록해야한다.
- 문법은 @Component(

#java.config 방식 - @Configuration
- java config 클래스임을 표시할 때 사용하는 에노테이션.
main클래스의 에노테이션컨테이너클래스에게 패키지이름을 알려주자.
패키지명을 지정하면 해당 패키지의 모든 클래스를 찾아
@Component, @Service, @Controller, @Repository
애노테이션이 붙은 클래스에 대해 객체를 자동 생성한다.
또한,
@Configuration 애노테이션이 붙은 클래스를 찾아 객체를 생성한다.
그리고 그 클래스에 @Bean 애노테이션이 붙은 메서드를 호출하여
그 리턴 값을 저장한다.

#Mybatis SqlSessionFactory 연동하기

-입력스트림 준비하기.
<bean ~
팩토리 매서드 : 호출할 스테틱 매서드
컨스트럭터 아규 : 설정할 값

아~ 지저분해 !!

#sqlSessionfactory `factoryBean`클래스를 사용하자
-sqlSessionfactory를 만들어주는 `공장객체`!
-sqlSessionFactory 에 저장된 객체는 팩토리빈 클래스가 아니라 getObject()매서드가 리턴한 값이다.

#근데 사실 우리가 factory를 만들어줄 필요없음ㅋ 스프링이 알아서해줌.
-근데 build.gradle을 하기위해 설정은 해야한다.
-maven.org : mybatis-spring 2.0.6


#Dao구현체를 만들기 귀찮다. mybatis한테 해달라하자.
xml컨피그방식 -




자바컨피그방식은 @MapperScan("맵퍼경로") 을 붙여주자

# 일단 적어보자..
Mybatis 와 spring을 연동해보자...
너무 어렵다
맵퍼파일의 네임스페이스명이 인터페이스이름과 같아야한다.
빌드 그레이들 변경.
app-sevlet 변경
mapper 네임스페이스 변경(com.eomcs.pms.dao.BoardDao)
Dao의 파라미터타입과 Mapper의 파라미터타입이 같은 지 확인한다. 리졸트맵은 신경쓰지마
다오구현체와 util(sqlSession) 전체를 날려버린다.
