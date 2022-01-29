package chap06.sec13.exam01_class_access.package2;

import chap06.sec13.exam01_class_access.package1.B;

public class C {
	// A a; // 컴파일 에러 ( A 클래스의 접근제한자는 default: 다른패키지에서 접근을 못함)
	B b; // B는 public으로 선언했기에 접근 가능
}
