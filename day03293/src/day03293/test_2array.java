package day03293;

public class test_2array {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		
		// �� 1���� �迭�� ũ�Ⱑ �ٸ� 2���� �迭
		int[][] raggedArr = new int[3][];
		raggedArr[0] = new int[4];
		raggedArr[1] = new int[3];
		raggedArr[2] = new int[5];
		
		// ���� for������ 2���� �迭 ���
		// new int[��][��]
		// �� : 2���� �迭 ũ�� = ����
		// �� : 2���� �迭 ũ�� = ����
		// arr[r][c] : r�� c���� ����, r��° 1���� �迭�� c��°
		for(int r=0; r<3; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
	}
}