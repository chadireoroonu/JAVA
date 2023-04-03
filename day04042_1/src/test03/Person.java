package test03;

public class Person extends Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("안녕??");
	}
	
	// 자식 클래스에서 독단적으로 eat() 메서드 정의
	public void eat() {
		System.out.println("쌀밥을 먹어요.");
	}
}
