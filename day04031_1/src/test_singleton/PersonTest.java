package test_singleton;

public class PersonTest {
	public static void main(String[] args) {
//		Person p1 = new Person(); // singleton에서는 객체 추가 생성 불가
		Person p1 = Person.getInstance();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = Person.getInstance();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
	}
}
