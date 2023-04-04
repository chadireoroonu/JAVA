package test07_generic_method;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수 선언
		// 제네릭 클래스로 객체 생성
		// 선언, 객체 생성 시 타입 지정 
		GenericBox<String> strBox = new GenericBox<String>();
		strBox.setData("Hello Generic!");
		System.out.println(strBox.getData());
		strBox.genericMethod(123);
		// Gerneric Method는 호출 시 타입 결정 
		
	}
}
