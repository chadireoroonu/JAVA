package test01_Interface;

// interface keyword 사용 
public interface MyInterface {
	// 모든 멤버면수는 public static final, 생략 가능 
	public static final int MEMBER_1 = 10;
	int MEMBER_2 = 10;

	// 모든 메서드는 public abstract, 생략 가능 
	public abstract void method1();
	void method2();
}
