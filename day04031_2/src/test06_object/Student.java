package test06_object;

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
	
//	우클릭 -> Source -> Override Implement Methods -> equals 
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	@Override
	public boolean equals(Object obj) {
		// Student 형변환 필요 
		// name 같으면 같은 객체로 파악 
		return name.equals(((Student)obj).name); 
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name="+super.name+", age="+super.age+", major="+this.major+"]";
	}

}
