package day04241;

import java.util.Scanner;

public class boj_8393_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = 0;
		for(int i = 1; i <= n; i++) {
			temp += i;
		}
		System.out.println(temp);
	}
}