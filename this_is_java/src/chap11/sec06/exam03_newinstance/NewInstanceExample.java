package chap11.sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("chap11.sec06.exam03_newinstance.SendAction");
			Class clazz = Class.forName("chap11.sec06.exam03_newinstance.ReceiveAction"); 
			Action action = (Action) clazz.newInstance(); // object로 반환하기에 부모 타입으로 타입변환
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		

	}

}
