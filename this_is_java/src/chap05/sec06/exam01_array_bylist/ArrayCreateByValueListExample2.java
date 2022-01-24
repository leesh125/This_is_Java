package chap05.sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{83, 90, 87}; // 배열 변수를 미리 선언하고 값 목록을 나중에 설정하려면 new를 사용해야함
		int sum1 = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83,90,87}); // 배열 객체를 매개변수로 삼을땐 new 가 필요함
		System.out.println("총합: " + sum2);
		
	}

	public static int add(int[] scores) {
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
