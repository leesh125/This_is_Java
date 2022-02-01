package chap07.sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); // dog 클래스가 추상 메소드를 재정의함
		cat.sound();
		System.out.println("------------------");
		
		// 부모타입으로 자동 타입 변환이더라도 
		// 자식타입에서 재정의한 메소드가 있으면 자식 메소드 실행
		Animal animal = null;
		animal = new Dog();
		animal.sound(); 

		animal = new Cat();
		animal.sound();
		System.out.println("------------------");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}

	// 매개변수의 다형성(Animal을 상속받은 Dog, Cat이 매개변수로 가능)
	public static void animalSound(Animal animal) {
		animal.sound(); // Dog이 들어오면 Dog에서 재정의한 sound()가 호출 (멍멍)
	}

}
