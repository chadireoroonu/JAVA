package test_default;

// class = public or default 
public class Person {
	// 접근제한자 생략 시, default 적용 
	// default => 같은 패키지에 접근 가능
	String name;
	int age;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		// 해당 클래스 내 private 접근 가능
		p1.name = "김이름";
		
	}
}
