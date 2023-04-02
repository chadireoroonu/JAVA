package test_getter_setter;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); // 자동생성자 
//		p1.name = "김이름" // private 멤버변수 접근 불가 
		p1.setName("김이름"); // public 메서드이기 때문에 사용가능
		p1.setAge(30); // setter 이용해 멤버변수 값 수정 가능 
		p1.setAge(-10);
		p1.setAge(500);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}
}
