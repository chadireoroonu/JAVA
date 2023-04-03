package test02;

public class Test {
	public static void main(String[] args) {
//		Animal a = new Animal(); 추상클래스로 객체 생성 불가 
		
		// 다형성 
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		// 부모 클래스 타입으로 생성했지만
		// 메서드는 호출된 실제 생성 객체의 메서드 실행 
		a1.speak();
		a2.speak();
		a3.speak();
		
		// 추상클래스 쓰는 이유
		// 1. 객체가 생성되지 못하도록 막기(그게 합리적일 떄)
		// 2. 자식 클래스에서 메서드 재정의를 강제하기(Override)
		// 3. 다형성을 이용하기 위해
		// 4. 상속을 통한 코드 중복 제거 
		
	}
}
