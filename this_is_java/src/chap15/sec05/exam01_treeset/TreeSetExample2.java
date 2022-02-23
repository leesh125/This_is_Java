package chap15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87)); // int 값 넣어도 됨
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(93));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet =  scores.descendingSet(); // 내림차순 정렬된 것을 set으로
		for(Integer score: descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

		// 내림차순 2번 -> 오름차순
		NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
		for(Integer score: asendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

	}

}
