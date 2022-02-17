package chap14.sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// 2의 배수를 검사
		IntPredicate predicateA = a-> a%2 == 0; // 리턴(중괄호 포함) 생략
		
		// 3d의 배수를 검사
		IntPredicate predicateB = a-> a%3 == 0; // 리턴(중괄호 포함) 생략
		
		IntPredicate predicateAB;
		boolean result;
		
		// and() : 둘 다 true여야 true
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수 입니까? " + result);
		
		// or() : 둘 다 false여야 false
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수 입니까? " + result);
		
		// negate() : true-> false, false->true
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수 입니까? " + result);
	}

}
