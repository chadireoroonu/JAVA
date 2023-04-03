package test09_polymorphism3;

public class Test {
	public static void main(String[] args) {
		SubClass child = new SubClass();
		System.out.println(child.x);
		child.method();
		
		SuperClass parent = child;
		System.out.println(parent.x);
		parent.method();

//		print
//		sub
//		sub class method
//		super
//		sub class method
//		메서드 오버라이드 가능
//		멤버변수 오버라이드 불가능 
		
	}
}
