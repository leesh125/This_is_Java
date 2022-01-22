package chap04.verify;

public class Exercise04 {

	public static void main(String[] args) {
		int n1,n2;
		
		while(true) {
			n1 = (int)(Math.random()*6) + 1;
			n2 = (int)(Math.random()*6) + 1;
			
			System.out.println("(" + n1 + ", " + n2 + ")");
			if(n1+n2 == 5) break;
		}

	}

}

