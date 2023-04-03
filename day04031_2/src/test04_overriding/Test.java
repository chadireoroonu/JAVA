package test04_overriding;

public class Test {
	public static void main(String[] args) {
		// Person, Student 에서 파라미터가 있는 생성자를 만들어서 에러 발생 
		Student st = new Student("김이름", 20, "자바");
		// 필요하다면 자식 클래스에서 부모의 메서드 재정의 가능 
		st.eat(); // after override
	}
}
