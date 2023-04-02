package test_default;

public class PersonTest {
	public static void main(String[] arg) {
		Person p1 = new Person();
		// 다른 클래스, 같은 패키지 => 접근 가능 
		// 다른 패키지 => 접근 불가능 
		// default => 같은 패키지에 접근 가능
		p1.name = "이성함";
		
	}
}
