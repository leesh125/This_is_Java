package chap13.verify.exam04;

public class Util {
	// how1
//	public static <K,V> V getValue(Pair<K,V> p, K k){
//		if(p.getKey().equals(k)) {
//			return p.getValue();
//		}
//		return null;
//	}
	
	// how2
	public static <P extends Pair<K,V>, K, V> V getValue(P p, K k){
		if(p.getKey().equals(k)) {
			return p.getValue();
		}
		return null;
	}
}
