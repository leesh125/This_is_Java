package chap11.sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 재정의한 clone()이 아닌 Object의 clone
		Member cloned = (Member) super.clone(); 
		// Arrays.copyOf: 새로운 scores 배열 생성
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); 
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // 재정의한 clone(
		} catch (CloneNotSupportedException e) {} 
		return cloned;
	}
}
