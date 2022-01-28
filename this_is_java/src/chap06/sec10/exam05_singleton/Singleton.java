package chap06.sec10.exam05_singleton;

public class Singleton {
	// 자기 자신 내부에선 new 가능(private)
	private static Singleton singleton = new Singleton(); 
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
