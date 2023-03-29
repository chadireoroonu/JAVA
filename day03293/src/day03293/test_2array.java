package day03293;

public class test_2array {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		
		// 각 1차원 배열의 크기가 다른 2차원 배열
		int[][] raggedArr = new int[3][];
		raggedArr[0] = new int[4];
		raggedArr[1] = new int[3];
		raggedArr[2] = new int[5];
		
		// 이중 for문으로 2차원 배열 출력
		// new int[행][열]
		// 행 : 2차원 배열 크기 = 길이
		// 열 : 2차원 배열 크기 = 길이
		// arr[r][c] : r행 c열의 원소, r번째 1차원 배열의 c번째
		for(int r=0; r<3; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
	}
}