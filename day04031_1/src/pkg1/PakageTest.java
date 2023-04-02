package pkg1;

//import pkg1.pkg2.Person; // pkg1.pkg2
//import pkg1.pkg2.pkg3.Person; // pkg1.pkg2.pkg3

public class PakageTest {
	public static void main(String[] args) {
		
		// 서로 다른 패키지에 있는 클래스 중 하나를 골라 쓸 때 
//		Person p1 = new Person();
//		System.out.println(p1.pkg); // pkg1
		
		// 만약 서로 다른 패키지에 있는 이름이 같은 클래스 두개 이상 사용 시
		// 패키지 생략 불가능 => pakage_name.class_name 
		
		pkg1.Person p1 = new pkg1.Person();
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		Person p4 = new Person();
		
		System.out.println(p1.pkg);
		System.out.println(p2.pkg);
		System.out.println(p3.pkg);
		System.out.println(p4.pkg); // import 따라 결정 
		
	}
}
