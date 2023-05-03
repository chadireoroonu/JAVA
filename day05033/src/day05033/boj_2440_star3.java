package day05033;

import java.util.*;

public class boj_2440_star3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		scan.close();
		int n = 5;
		
		String star = "";
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				star += "*";
			}
			System.out.println(star);
			star = "";
		}
	}
}