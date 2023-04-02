package test_private;

import test_public.Person;

public class PersonTest extends Person {
	
	public static void main(String[] arg) {
		PersonTest p1 = new PersonTest();
		p1.name = "정사람";
		// 다른 클래스, 다른 패키지 => 접근 가능
		
	}
}