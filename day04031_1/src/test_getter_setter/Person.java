package test_getter_setter;

public class Person {
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
