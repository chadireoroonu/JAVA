package day03293;

import java.util.Arrays;

public class test_frequency {
	public static void main(String[] args) {
		// 0부터 9까지
		int[] arr= {0, 0, 2, 1, 0, 3, 6, 2, 5, 7, 8, 5, 2, 5, 3};
		// 카운팅 배열
		int[] count= new int[10]; // 크기는 최대값 +1
		// count[num] : num 빈도수
		// count[index] : index가 num인 숫자의 빈도수
		System.out.println(Arrays.toString(count));
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
	}
}