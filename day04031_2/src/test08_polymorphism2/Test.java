package test08_polymorphism2;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student("김이름", 20, "자바");
		
		Person p1 = st1;
		
		Student st3 = (Student) p1;
		st3.study(); // 공부를 한다. 
		
		Person p2 = new Person("이성함", 21);
		
//		Student st2 = (Student) p2;
//		st2.study(); // 자동완성으로 불러올 수는 있지만 실행 시 에러 발생 
		
		
	}
}