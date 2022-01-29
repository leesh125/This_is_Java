package chap06.sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// Service 클래스에 선언된 메소드 얻기(리플렉션)
		// 리플랙션 : 런타임 시에 클래스의 메타 정보를 얻는 기능(클래스가 가지고 있는 필드, 생성자, 메서드 등등)
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			// System.out.println(method.getName()); // 메서드 이름 출력
			
			// 해당 메서드에 @PrintAnnotaion 이 적용되었는지 확인하는 조건문
			if(method.isAnnotationPresent(PrintAnnotation.class)) {

				// 해당 메서드에 적용된 어노테이션 객체를 얻음(value, number 엘리먼트를 얻기위해)
				PrintAnnotation printAnnotation = 
						method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력
				for(int i=0; i<=printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				// 메소드 호출
				/*
				 * 아래 코드와 동일
				 * Service service = new Service();
				 * service.method1();
				 */
				try {
					method.invoke(new Service());
				} catch (Exception e) {
				} 
				System.out.println();
//				System.out.println(method.getName() + ": ");
//				System.out.println("value= " + printAnnotation.value());
//				System.out.println("number= " + printAnnotation.number());
//				System.out.println();
			}
		}
	}

}
