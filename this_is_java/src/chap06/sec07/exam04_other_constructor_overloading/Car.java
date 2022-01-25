package chap06.sec07.exam04_other_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		this(model,null,0);
		System.out.println("Car(Stinrg model) 실행"); // 
	}
	
	
	Car(String model, String color) {
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		this(model,color,0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
