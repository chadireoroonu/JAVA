package day03293;

import java.util.Arrays;
import java.util.Scanner;

public class test_array_and_loof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for(int i=0; i<5; i++) {
			scores[i] = sc.nextInt();
		}
		
		// �������� ���
//		for(int i=0; i<5; i++) {
//			System.out.println(i+"��° ������ :"+scores[i]);
//		}
		
		//for-each
		for(int num : scores) {
			System.out.println("������ :"+num);
		}
		
		// Arrays.toString�� �̿��� �迭 ���
		System.out.println(Arrays.toString(scores));
		
		// ��� ���ϱ�
		int sum = 0;
		for(int num : scores) {
			sum = sum + num; // sum += num;
		}
		System.out.println(sum / 5);
		
	}
}
