package test01;

// 같은 패키지 안에서는 import 불필요 
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); // 객체의 생성 : new 키워드 + 생성자 호출 
		p1.name = "이름";
		p1.age = 20;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "성함";
		p2.age = 25;
		p2.eat();
	}
}
