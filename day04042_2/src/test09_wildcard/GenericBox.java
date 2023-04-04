package test09_wildcard;

// 클래스를 제네릭으로 만들기 위해
// 다양한 타입 처리가 가능하도록 타입 파라미터 주기
public class GenericBox<T> {
	// T는 타입처럼 사용 가능 
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
