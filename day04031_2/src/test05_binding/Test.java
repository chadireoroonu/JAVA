package test05_binding;

public class Test {
	public static void main(String[] args) {
		// Person, Student 에서 파라미터가 있는 생성자를 만들어서 에러 발생 
		Student st = new Student("김이름", 20, "자바");
		// 필요하다면 자식 클래스에서 부모의 메서드 재정의 가능 
		st.eat(); // after override -> 지식을 먹는다. 
		
		// 다형성
		Person st2 = new Student("이성함", 25, "자바");
		st.eat(); // 지식을 먹는다. 메모리상 Student 
		
		Person p1 = new Person("박임시", 30);
		p1.eat(); // 음식을 먹는다. 
		
//		불가능
//		Student p2 = new Person("정사람", 35, "파이썬");
//		Student p3 = new Person("송인간", 40);
		
	}
}