// 애노테이션 프로퍼티 - 프로퍼티 생략
package com.eomcs.annotation.ex4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {
  String value(); // 디폴트 값이 없기때문에 필수 프로퍼티이다.

  String tel(); // tel 은 필수.
}


