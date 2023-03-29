package day0328;

import java.util.Scanner;

public class test_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 입력 받을 시 계속 반복
		// 그 외의 값이면 종료(반복X)
		int num = sc.nextInt();
		do {
			System.out.println("블록을 실행합니다.(단, 첫 번째에 한해서는 무조건 실행)");
			num = sc.nextInt();
		} while(num == 1);
	}
}
