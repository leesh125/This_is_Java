package chap05.sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 85, 93, 50};
		
		int sum = 0;
		// 향상된 for문
		for(int score: scores) { // score에 scores배열의 인덱스를 순차적으로 담음
			sum += score;
		}
		
		System.out.println("점수 총합: " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균: " + avg);

	}

}
