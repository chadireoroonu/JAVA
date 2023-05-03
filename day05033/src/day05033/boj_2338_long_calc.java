package day05033;

import java.util.*;
import java.math.*;

public class boj_2338_long_calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		scan.close();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}
}