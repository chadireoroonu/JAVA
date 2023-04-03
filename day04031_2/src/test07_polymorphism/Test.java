package test07_polymorphism;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		// 부모 클래스 참조 시 자식 클래스 메서드 사용 불가 
		persons[0] = new Person("김이름", 20);
		persons[1] = new Person("이성함", 21);
		persons[2] = new Student("박임시", 22, "자바");
		
		for(Person p : persons) {
			System.out.println(p.toString());
		}
		
//		print
//		Person [name=김이름, age=20]
//		Person [name=이성함, age=21]
//		Student [name=박임시, age=22, major=자바]
				
	}
}