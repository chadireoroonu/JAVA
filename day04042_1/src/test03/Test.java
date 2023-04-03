package test03;

public class Test {
	public static void main(String[] args) {
		// 자식 클래스에서 추상클래스에 없는 메서드 추가
		// eat
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
//		a1.eat() // 자식 클래스에서 추가한 메서드 사용 불가 
//		해결방법 1. 사용하려면 부모 클래스에 추상메서드 or 일반메서드 정의 필요 
		
		
		// 조상 클래스에서 일반 메서드로 만드는 것 vs 추상메서드 사용하는 것 
		// 일반 메서드 -> 상속 
		// 추상 메서드 -> 상속
		// 재정의 강제 여부에서 차이점이 있음 
		
		// 부모 클래스에서 일반 메서드를 사용하는 경우 -> 자식 클래스에서 재정의 생략 가능
		// 부모 클래스에서 일반 메서드, 추상 메서드 둘다 만들지 않는 경우 -> 다형성 활용 불가 
	}
}
