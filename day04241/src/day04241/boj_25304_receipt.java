package day04241;

import java.util.Scanner;

public class boj_25304_receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int n = sc.nextInt();
		int temp = 0;
		for(int i = 0; i < n; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			temp += a*b;
		}
		if(total == temp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			}
		}
}