package test08_numberbox;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수 선언
		// 제네릭 클래스로 객체 생성
		// 선언, 객체 생성 시 타입 지정 
		NumberBox<Double> strBox = new NumberBox<Double>();
		strBox.setData(28.2356);
		System.out.println(strBox.getData());
		strBox.genericMethod(123);
		// Gerneric Method는 호출 시 타입 결정 
		
	}
}
