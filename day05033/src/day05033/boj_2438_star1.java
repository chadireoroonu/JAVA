package day05033;

import java.util.Scanner;

public class boj_2438_star1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String star = "";
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			star += "*";
			System.out.println(star);
		}
	}
}