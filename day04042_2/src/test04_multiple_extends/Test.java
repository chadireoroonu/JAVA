package test04_multiple_extends;

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
