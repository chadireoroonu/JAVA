package day04123;

import java.util.Scanner;

public class boj_2525_ovenclock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if((m+t)<60)
			m += t;
		else {
			h += (m+t)/60;
			m = (m+t)%60;
		}
		if(h>=24)
			h -= 24;
		
		System.out.println(h+" "+m);
	}
}
