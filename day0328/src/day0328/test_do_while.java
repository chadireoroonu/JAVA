package day0328;

import java.util.Scanner;

public class test_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 �Է� ���� �� ��� �ݺ�
		// �� ���� ���̸� ����(�ݺ�X)
		int num = sc.nextInt();
		do {
			System.out.println("����� �����մϴ�.(��, ù ��°�� ���ؼ��� ������ ����)");
			num = sc.nextInt();
		} while(num == 1);
	}
}
