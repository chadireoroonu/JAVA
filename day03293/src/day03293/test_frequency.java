package day03293;

import java.util.Arrays;

public class test_frequency {
	public static void main(String[] args) {
		// 0���� 9����
		int[] arr= {0, 0, 2, 1, 0, 3, 6, 2, 5, 7, 8, 5, 2, 5, 3};
		// ī���� �迭
		int[] count= new int[10]; // ũ��� �ִ밪 +1
		// count[num] : num �󵵼�
		// count[index] : index�� num�� ������ �󵵼�
		System.out.println(Arrays.toString(count));
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
	}
}