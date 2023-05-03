package day05033;

import java.util.Scanner;

public class boj_25314_coing_is_pe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		sc.close();
		
		for(int i = 1; i <= n/4; i++) {
			str += "long ";		
		}
		System.out.println(str + "int");
	}
}