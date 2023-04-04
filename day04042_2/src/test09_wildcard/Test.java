package test09_wildcard;

public class Test {
	public static void main(String[] args) {
		GenericBox<Student> studentBox = new GenericBox<>();
		GenericBox<Person> personBox = new GenericBox<>();
		GenericBox<Object> objectBox = new GenericBox<>();
		
		// ? : 모든 타입 가능
		GenericBox<?> allBox = objectBox;
		allBox = personBox;
		allBox = studentBox;
		
		// ? extends T : T or T의 자손만 가능
		GenericBox<? extends Person> personAndChild = personBox;
		personAndChild = studentBox;
//		personAndChild = objectBox; -> ERROR
		
		// ? super T : T or T의 조상만 가능
		GenericBox<? super Person> personAndParent = personBox;
		personAndParent = objectBox;
//		personAndParent = studentBox; -> ERROR
		
	}
}
