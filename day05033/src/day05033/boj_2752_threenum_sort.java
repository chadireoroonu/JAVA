package day05033;

import java.util.*;

public class boj_2752_threenum_sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		if(a < b) {
			if(b < c) {
				System.out.println(a+" "+b+" "+c);
			} else if (b > c) {
				if (a < c) {
					System.out.println(a+" "+c+" "+b);
				} else {
					System.out.println(c+" "+a+" "+b);
				}
			}
		} else {
			if (b > c) {
				System.out.println(c+" "+b+" "+a);
			} else if (b < c) {
				if (a > c) {
					System.out.println(b+" "+c+" "+a);
				} else {
					System.out.println(b+" "+a+" "+c);
				}
			}
		}
	}
}
