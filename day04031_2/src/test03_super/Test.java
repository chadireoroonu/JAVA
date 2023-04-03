package test03_super;

public class Test {
	public static void main(String[] args) {
		// Person, Student 에서 파라미터가 있는 생성자를 만들어서 에러 발생 
		Student st = new Student("김이름", 20, "자바");
		st.eat(); // before override
	}
}
