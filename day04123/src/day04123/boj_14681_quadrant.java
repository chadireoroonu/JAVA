package day04123;

import java.util.Scanner;

public class boj_14681_quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� �� �Է� �ÿ��� Scanner �� ��
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>0) {
			if(b>0)
				System.out.println("1");
			else 
				System.out.println("4");
			}
		
		else {
			if(b>0)
				System.out.println("2");
			else
				System.out.println("3");
			}
	}
}