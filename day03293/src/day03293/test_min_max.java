package day03293;

public class test_min_max {
	public static void main(String[] args) {
		int[] arr = {21, 3, 45, 67, 12, 1, 45, 99, 102, 30, 504};
		
		// �ּҰ� �ִ밪
		int min = arr[0]; // ù ���Ҹ� �ӽ� �ּҰ����� ����
		int max = arr[0]; // ù ���Ҹ� �ӽ� �ִ밪���� ����
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
