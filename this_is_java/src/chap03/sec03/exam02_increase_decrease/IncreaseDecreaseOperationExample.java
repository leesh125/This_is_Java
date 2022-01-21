package chap03.sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------");
		x++; // x = x+1
		++x; // x = x+1
		System.out.println("x=" + x); // 12
		
		System.out.println("------------");
		y--; // y = y-1
		--y; // y = y-1
		System.out.println("y=" + y); // 8
		
		System.out.println("------------");
		z = x++; // x값을 먼저 z에 먼저 저장후 x를 1 증가
		System.out.println("z=" + z); // 12
		System.out.println("x=" + x); // 13
		
		System.out.println("------------");
		z = ++x; // x값을 먼저 1 증가 후 z에 x값을 대입
		System.out.println("z=" + z); // 14
		System.out.println("x=" + x); // 14
		
		System.out.println("------------");
		z = ++x + y++; // x 값을 1 증가 후, x 와 y 를 더한 후, z에 대입한 후, y를 1 증가
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
		
	}

}
