package day05033;

import java.util.*;

public class boj_2439_star2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		String star = "";
		String space = "";
		
		for(int i = 1; i <= n; i++) {
			star += "*";
			for(int j = n - i; j > 0; j--) {
				space += " ";
			}
			System.out.println(space+star);
			space = "";
		}
	}
}