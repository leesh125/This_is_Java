package chap15.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87)); // int 값 넣어도 됨
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(93));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first(); // 가장 왼쪽에 있는 값(가장 작은 값)
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last(); // 가장 오른쪽에 있는 값(가장 높은 값)
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(95); // 매개값보다 낮은 값을 구함
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(95); // 매개값보다 높은 값을 구함
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95)); // 매개값보다 낮은 값을 구함, 본인 값 포함
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85)); // 매개값보다 높은 값을 구함, 본인 값 포함
		System.out.println("85점 이거나 바로 위의 점수: " + score);
		while(!scores.isEmpty()) {
			score = scores.pollLast(); // 제일 오른쪽 자식 노드부터 하나씩 set에서 뺀다(제거).
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
		
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst(); // 제일 왼쪽 자식 노드부터 하나씩 set에서 뺀다(제거).
//			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
//		}
//		
//		Iterator<Integer> iterator = scores.iterator();
//		while(iterator.hasNext()) {
//			int s = iterator.next(); // 가져오기만 하지 제거는 안함
//			// iterator.remove(); // remove()는 제거
//			System.out.println(s);
//		}
		
	}

}
