package chap15.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키가 같기에 제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 95
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // Key Set 얻기(Map 컬렉션의 키만 얻어옴)
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); // int 가능
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동"); // "홍길동"이 key인 Map entry 삭제
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // MapEntry가 저장된 Set얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		
	}

}
