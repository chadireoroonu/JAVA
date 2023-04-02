package test_protected;

//class = public or default 
public class Person {
	// 원칙적으로 다른 패키지 접근 불가능
	// 상속 받으면 다른 패키지 접근 가능 
	protected String name;
	protected int age;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		// 해당 클래스 내 private 접근 가능
		p1.name = "김이름";
		
	}
}