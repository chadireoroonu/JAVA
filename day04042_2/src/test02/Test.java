package test02;

public class Test {
	public static void main(String[] args) {
		// 출력장치
		// 인터페이스는 객체 생성 불가
		// 해당 인터페이스 구현한 클래스로 객체 생성 가능
		HdmiOutput monitor = new Monitor(); // 다형성
		HdmiOutput televison = new Television();
		
		HdmiInput computer = new Computer();
//		computer.setOutput(monitor);
		computer.setOutput(televison);
		computer.show();
		
		HdmiInput supercomputer = new SuperComputer();
		supercomputer.setOutput(monitor);
		supercomputer.show();
		
		// 인터페이스 사용 시 클래스가 바뀔 때마다 코드를 고치지 않아도 됨
		// 인터페이스를 구현하기만 하면 어떤 클래스의 객체든 사용할 수 있음 
	}
}
