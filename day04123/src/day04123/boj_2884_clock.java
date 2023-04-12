package day04123;

import java.util.Scanner;

public class boj_2884_clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0) {
			if(m>=45)
				m -= 45;
			else {
				h = 23;
				m += 15;
			}
		}
		else if(m>=45)
			m -= 45;
		else {
			h -= 1;
			m += 15;
		}
			
		System.out.println(h+" "+m);
	}
}
