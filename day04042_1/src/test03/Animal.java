package test03;

// 1. 굳이 객체 생성 불필요 
// 2. 추상 메서드를 가지는 클래스 
abstract public class Animal {
	// 추상메서드 만들기 
	// 1. abstract 키워드 
	// 2. {} 블록과 내용(구현부) 없이 ; 으로 종료
	abstract public void speak();
	// 1. 접근제한자 : public, (default), protected, private
	// 2. 그 외 제한자(지정예약어) : static, final, abstract
	// 1, 2 순서는상관 없음
	// abstract public == public abstract 
	
	public void eat() {} // 추상메서드가 아니라도 빈 껍데기라도 있어야 함 
	
	public static int a = 10;
	static public int b = 20;
	
}
