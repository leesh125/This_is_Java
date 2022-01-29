package chap06.sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // @printannotation은 method 선언에만 적용이 가능하다는 뜻
@Retention(RetentionPolicy.RUNTIME) // 런타임 시까지 어노테이션 정보를 유지하겠다
public @interface PrintAnnotation {
	String value() default "-"; // type이 String인 value라고 하는 element 선언(변수와 비슷)
	int number() default 15; // 기본값 15
}
