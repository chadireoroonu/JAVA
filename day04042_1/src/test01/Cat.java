package test01;

// 추상클래스를 상속받는 일반클래스 -> 모든 추상메서드 Overide 필수 
public class Cat extends Animal {
	
	// Cat 빨간줄 표시 없애는 법
	// 좌측 엑박 클릭 -> Add unimplemented methods
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("야옹~!");
	}
	
}
