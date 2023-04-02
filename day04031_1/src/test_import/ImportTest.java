package test_import;

//import java.util.Scanner;
//import java.util.Date;
//import java.util.Arrays;

import java.util.*;
//import java.util.logging.*;
// 하위패키지도 독립된 패키지기 때문에 별도의 import 필요 

public class ImportTest {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.toString(arr);
		
//		java.util.logging.Logger => 사용불가
//		Logger l = Logger.getGlobal(); // 사용하려면 import 필요 
		
	}
}
