package test01_Interface;


// 클래스는 인터페이스를 구현
// 인터페이스는 클래스에 의해 구현
// 클래스가 인터페이스 구현할 때는 implements 키워드 사용 
public class MyClass implements MyInterface {
	
	// 클래스는 구현하는 인터페이스의 모든 추상메서드 오버라이드 필수 
	@Override
	public void method1() {
		System.out.println("method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("method 2");
		
	}

}
