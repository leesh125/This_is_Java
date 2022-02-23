package chap15.verify.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		// how 1
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet){
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		
		
		// how 2
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			if(maxScore < value) {
				name = key;
				maxScore = value;
			}
			totalScore += value;
		}
		
		System.out.println("평균점수: " + (totalScore/map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}

