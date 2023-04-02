package test_private;

import test_protected.Person;

public class PersonTest extends Person {
	
	public static void main(String[] arg) {
		PersonTest p1 = new PersonTest();
		p1.name = "박임시";
		// 다른 클래스, 같은 패키지 => 접근 가능 
		// 다른 패키지 => 접근 불가능 
		// 다른 패키지 상속 => 접근 가능 
		
	}
}