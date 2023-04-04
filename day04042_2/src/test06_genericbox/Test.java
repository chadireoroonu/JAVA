package test06_genericbox;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수 선언
		// 제네릭 클래스로 객체 생성
		// 선언, 객체 생성 시 타입 지정 
		GenericBox<String> strBox = new GenericBox<String>();
		strBox.setData("Hello Generic!");
		System.out.println(strBox.getData());
		
		// new keyword 뒤 생성자 호출 시 <>안 생략 가능
		// 컴파일러가 문맥에서 유추해줌 
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.setData(2023);
		Integer i = intBox.getData();
		
		// Integer : 래퍼클래스 (wrapper class)
		// 기본형으로 사용하는 int -> 값
		// 래퍼클래스 이용 시 객체처럼 취급 가능
		int b = 123;
		
		// 래퍼클래스 
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> float
		// double -> Double
		// char -> Character
		// boolean -> Boolean
		// void -> Void
		
		int i1 = new Integer(123); // 기본형 값으로만 사용 가능 
		Integer i2 = new Integer(123); // 객체처럼 사용 가능 
		
		// static method
		int num = Integer.parseInt("123123");		
		
	}
}
