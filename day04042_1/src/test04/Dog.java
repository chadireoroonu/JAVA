package test04;

public class Dog extends Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!!");
	}
	
	// 자식 클래스에서 독단적으로 eat() 메서드 정의
	public void eat() {
		System.out.println("개껌을 먹어요.");
	}
		
}
