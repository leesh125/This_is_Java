package chap10.sec02.runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Dog으로 변환이 어렵습니다.");
		}
	}

}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}