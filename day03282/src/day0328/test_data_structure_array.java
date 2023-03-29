package day0328;

public class test_data_structure_array {
	public static void main(String[] args) {
		boolean[] bArr = new boolean[5];
		char[] cArr = new char[5];
		float[] fArr = new float[5];
		double[] dArr = new double[5];
		String[] sArr = new String[5]; // 참조형 배열
		
		System.out.println(bArr[0]);
		System.out.println(cArr[0]); // '/u0000' 출력 시 보이지는 않음
		System.out.println(fArr[0]);
		System.out.println(dArr[0]);
		System.out.println(sArr[0]);
	}
}
