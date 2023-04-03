package test06_object;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		// Person, Student 에서 파라미터가 있는 생성자를 만들어서 에러 발생 
		Student st1 = new Student("김이름", 20, "자바");
		// 필요하다면 자식 클래스에서 부모의 메서드 재정의 가능 
		st1.eat(); // after override -> 지식을 먹는다. 
		st1.toString();
		
		Student st2 = new Student("김이름", 25, "자바");
		
		// before override -> false
		// after override -> false
		System.out.println(st1 == st2);
		
		// before override -> false
		// after override -> true
		System.out.println(st1.equals(st2));

		
		System.out.println(st1.toString()); // method inheritance from Object
		// before override -> test06_object.Student@2a139a55
		// after override in Person -> Person [name=김이름, age=20]
		// after override in Student -> Student [name=김이름, age=20, major=자바]
		
		Set<Student> set = new HashSet<>();
		set.add(st1);
		set.add(st2);
		
		System.out.println(set.size()); // 집합 속 원소의 개수
		// before override -> 2
		// after override -> 1
		// set은 동일성 판단을 위해 equals(), hashCode() 사용
		
	}
}