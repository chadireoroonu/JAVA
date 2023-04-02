package test04;

public class Person {
	// static 키워드 -> 클래스 변수
	// 이 클래스로 생성되는 모든 인스턴스가 공유 
	static String species = "호모 사피엔스 사피엔스";
	
	// static 키워드 없을 시 -> 인스턴스 변수 
	String name;
	int age;
	
	// 생성자를 만들지 않고 진행
	// 만약 설계도에 생성자가 하나도 없다면
	// JVM이 기본생성자 추가
	// Person() {};
	
	// 메서드 오버로딩 : 이름이 같은 메서드 여러개 생성 가능
	// 단, 파라미터가 달라야 함
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	// 메서드의 종료
	// 1. 블록의 끝을 만날 때 
	// 2. return 문을 만날 때 (void 에서도 return 문 쓸 수 있음) 
	
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability < 0.56)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("유튜브 영상을 시청합니다.");
	}
	
	// 메서드 오버로딩 
	public void eat() {
		// 지역 변수
		String dish = "짜장면";
	}
	
	public void eat(String dish) {
		System.out.println(dish+"를 먹습니다.");
	}
	
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"번 먹습니다.");
	}
	
	// 파라미터의 순서를 바꾸는 경우는 오버로딩 가능 
	public void eat(int times, String dish) {
		System.out.println(times+"번 "+dish+"를 먹습니다.");
	}
	
	
	
}
