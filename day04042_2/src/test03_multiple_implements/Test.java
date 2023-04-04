package test03_multiple_implements;

public class Test {
	public static void main(String[] args) {
		
		Duck d = new Duck();
		Eagle e = new Eagle();
		
		// d. => fly, swim, hunt 가능 
		
		// 다형성
		AbleToFly f = d;
		// f. => fly만 사용 가능 
	}
}
