package test_private;

// class = public or default 
public class Person {
	private String name;
	private int age;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		// 해당 클래스 내 private 접근 가능
		p1.name = "김이름";
		
	}
}
