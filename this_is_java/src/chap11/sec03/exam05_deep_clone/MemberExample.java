package chap11.sec03.exam05_deep_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] {90,20,40}, new Car("소나타"));
		
		// 깊은 복제이기에 값 바꿔도 원본에 영향을 안끼침
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"}":","); // 마지막 원소이면 , 빼기
		}
		System.out.println("\ncar: " + original.car.model);
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"}":",");
		}
		System.out.println("\ncar: " + cloned.car.model);
	}

}
