package test_singleton;

public class Person {
	
	// 싱글턴으로 바꾸기
	// 1. private으로 자기 자신 만들기
	// static 사용 이유 : 객체 생성하지 않고 클래스 이름으로 접근하기 위함
	private static Person instance = new Person();
	
	// 2. 생성자를 private으로 막기 
	private Person() {
		this.name = "유일한";
		this.age = 1000;
	}
	
	// 3. 유일한 객체에 접근 가능한 통로 만들기 
	public static Person getInstance() {
		return instance;
	}
	
	
	// getter, setter 만들기 
	// 멤버 변수 private 선언 
	private String name;
	private int age;
	private boolean hungry;
	
	
	// private 멤버 면수 접근 방법 
	// public 메서드
	// getter 접근자 : 값 조회 : get + 멤버변수 이름
	// setter 설정자 : 값 변경 : set + 멤버변수 이름 
	
	// 마우스 우클릭 -> Source -> generate getters and setters
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) { // 고치기 위해 매개변수 필요
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 양수만 입력가능합니다.");
			return;
		}
		if(age > 200) {
			System.out.println("적절한 값을 입력해주세요.");
			return;
		}
		this.age = age;
	}
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	
}
