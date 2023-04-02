package test02;

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
	
	public void eat() {
		// 지역 변수
		String dish = "짜장면";
	}
}
