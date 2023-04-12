package day04123;

import java.util.Scanner;

public class boj_2753_lunacalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4==0)
			if(a%400==0)
				System.out.println(1);
			else if(a%100==0)
				System.out.println(0);
			else
				System.out.println(1);
		else
			System.out.println(0);
	}
}
