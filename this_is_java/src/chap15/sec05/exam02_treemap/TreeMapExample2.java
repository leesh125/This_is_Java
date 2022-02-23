package chap15.sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "김길동");
		scores.put(new Integer(75), "박길동");
		scores.put(new Integer(95), "이길동");
		scores.put(new Integer(80), "최길동");
		
		NavigableMap<Integer, String> descendingMap =  scores.descendingMap();
		// Map.Entry를 가지고 있는 Set
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

		for(Map.Entry<Integer, String> entry:descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		NavigableMap<Integer, String> ascendingMap =  descendingMap.descendingMap();
		// Map.Entry를 가지고 있는 Set
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();

		for(Map.Entry<Integer, String> entry:ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
	}

}
