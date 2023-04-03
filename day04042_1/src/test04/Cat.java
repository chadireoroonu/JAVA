package test04;

// 추상클래스를 상속받는 일반클래스 -> 모든 추상메서드 Overide 필수 
public class Cat extends Animal {
	
	// Cat 빨간줄 표시 없애는 법
	// 좌측 엑박 클릭 -> Add unimplemented methods
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("야옹~!");
	}
	
	// 자식 클래스에서 독단적으로 eat() 메서드 정의
	public void eat() {
		System.out.println("츄르를 먹어요.");
	}
	
}
