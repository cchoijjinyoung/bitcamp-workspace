// 의존 객체 주입 자동화하기 - 자동화 전, XML 설정을 통한 수동 주입
package com.eomcs.spring.ioc.ex08.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(//
        "com/eomcs/spring/ioc/ex08/a/application-context.xml");

    // Car 객체를 꺼내 Engine 객체가 주입되었는지 확인해보자!
    System.out.println(iocContainer.getBean("c1"));
  }

}

// 우리는 의존객체를 자동화하고 싶다.
// 어떻게 해야할까?
// @Autowrired 에노테이션을 이용해보자

// Car property 에 Engine객체를 주입하지 말고 Car와 Engine 객체만 만들어보자.

// 리스너(BeanPostProcessor) - 빈 처리 후 처리기. 야!! 빈 생성됬어 처리해!
// 라고 리스너에게 통보.

// AutoworedAnnotationBeanPostProcessor 리스너가 있다면 @Autowired 에노테이션을 처리한다.

// Car.class 의 setEngine 매서드에 @Autowired 가 붙어있으면,
// 애노테이션 도우미를 등록해야한다.

// @Autowired 애노테이션 도우미 등록방법:
// 다음 클래스의 객체를 스프링 IoC Container 에 등록하면 된다.
// <bean class ="org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor">

// => 


