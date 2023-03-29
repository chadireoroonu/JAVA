package day0328;

public class test_array {
	public static void main(String[] args) {
		// 배열 변수의 선언
		int[] arr;
		int arr2[]; // 권장하지 않음
		
		int[] arr3 = new int[5]; //int형의 경우 0으로 초기화, 나눠쓰기 가능
		int[] arr4 = new int[] {1, 2, 3, 4, 5}; // 원하는 값으로 초기화할 때, 길이지정하지 않음, 나눠쓰기 가능
		int[] arr5 = {1, 3, 5, 7, 9}; // 반드시 한 줄에 써야 에러가 나지 않음
		
		int[] arr6;
		arr6 = new int[7];
		// arr6 = {1, 2, 3, 4, 5}; 불가능
		arr6 = new int[] {1, 2, 3, 4, 5};
	}
}
