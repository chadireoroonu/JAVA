package test05_binding;

// 클래스 상속 시 extends 사용 
public class Student extends Person {
	String major;
	
	// 파라미터가 있는 생성자를 만들어서 에러 해결
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
	@Override // 어노테이션 사용 시 실수 체크가능 -> 사용 권장 
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
	
}
