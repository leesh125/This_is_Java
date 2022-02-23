package chap15.sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "김길동");
		scores.put(new Integer(75), "박길동");
		scores.put(new Integer(95), "이길동");
		scores.put(new Integer(80), "최길동");
		
		Map.Entry<Integer, String> entry = null;
				
		entry = scores.firstEntry(); // 가장 낮은 키값의 entry 반환
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry(); // 가장 높은 키값의 entry 반환
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(95); // 95보다 작은 키를 찾아 해당 entry를 반환
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(95); // 95보다 높은 키를 찾아 해당 entry를 반환
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(95); // 95보다 작은 키를 찾아 해당 entry를 반환(본점수 포함)
		System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(95); // 95보다 높은 키를 찾아 해당 entry를 반환(본점수 포함)
		System.out.println("95점 이거나 바로 위 점수: " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); // 제일 왼쪽에 있는 값 반환 동시에 map에서 빼버림
			System.out.println(entry.getKey() + "-" + entry.getValue() +
					"(남은 객체 수: " + scores.size() + ")");
		}

	}

}
