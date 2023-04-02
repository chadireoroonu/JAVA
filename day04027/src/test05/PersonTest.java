package test05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("김이름", 30);
		Person p2 = new Person("이성함", 25);
		Person p3 = new Person("박임시", 20);
		Person p4 = new Person("박임시", 20);
		
		// 생성과 동시에 초기화
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p3.name);
		
	}
}