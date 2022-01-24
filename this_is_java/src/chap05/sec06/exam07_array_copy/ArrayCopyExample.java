package chap05.sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];

		// 깊은 복사    (복사당할배열, 시작점인덱스, 복사할배열, 시작점인덱스, 복사할 갯수)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}
		
	}

}
