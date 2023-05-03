package day05033;

import java.util.*;
import java.math.*;

public class boj_1271_rich2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger total = scan.nextBigInteger();
		BigInteger people = scan.nextBigInteger();
		scan.close();
		
		System.out.println(total.divide(people));
		System.out.println(total.remainder(people));
	}
}