package test05_normalbox;

public class Test {
	public static void main(String[] args) {
		NormalBox b = new NormalBox();
		
		b.setData("Hello World!");
		// instanceof 사용한 형변환 작업 필요
		String s = (String) b.getData();
		
	}
}
