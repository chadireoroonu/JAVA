package test08_numberbox;

// Number 자손들로만 타입 지정 가능하도록 타입 파라미터 제한 
public class NumberBox<T> {
	// T는 타입처럼 사용 가능 
	private T data;
	
	// 제네릭 메서드
	public <K> void genericMethod(K k) {
		// 타입 파라미터를 메서드 내부에서 타입처럼 사용 가능 
		// 제네릭 메서드의 타입 파라미터 범위는 메서드 내부로 한정 
		// T : 클래스의 타입 파라미터
		// K : 메서드만의 타입 파라미터 
		System.out.println("T: " + data.getClass().getName());
		System.out.println("K: " + k.getClass().getName());
		
	}
	
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
