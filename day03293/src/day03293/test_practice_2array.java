package day03293;

public class test_practice_2array {
	public static void main(String[] args) {
//		1 2 3 4 
//		5 6 7 8 
//		9 10 11 12
//		13 14 15 16
		
		// 행, 열 모두 뒤집어 출력
		int[][] arr = new int[4][4];
		int cnt = 1;
		for(int r=3; r>=0; r--) {
			for(int c=3; c>=0; c--) {
				arr[r][c] = cnt++;
			}
		}
		
		for(int r=0; r<4; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
	}
}
