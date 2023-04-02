package test01;
// 모든 클래스는 특정 패키지(폴더)에 속해 있음
// 패키지 : 클래스가 모여있는 폴더

// class 키워드를 사용 
public class Person {
	// 속성, 데이터, 필드, 변수
	String name;
	int age;
	
	// 생성자
	// 클래명과 같다.
	// 딱히 반환형을 지정하지 않음 (메서드와 다른 점) 
	public Person() {
		
	}
	
	// 메서드
	// void는 반환형이 없다는 의미 
	public void eat() {
		System.out.println(name+"이 먹습니다.");
	}
	
}
