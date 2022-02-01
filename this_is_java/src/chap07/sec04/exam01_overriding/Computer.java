package chap07.sec04.exam01_overriding;

public class Computer extends Calculator{

	/*
	 * @Override 생성 방법
	 * 1. alt + shift + O + v
	 * 2. ctrl + space 에서 부모 메서드 선택
	 */
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	
}
