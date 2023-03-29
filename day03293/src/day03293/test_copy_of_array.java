package day03293;

import java.util.Arrays;

public class test_copy_of_array {
	public static void main(String[] args) {
		int[] scores = new int[] {29, 45, 67, 84, 92};
//		scores[5] = 44; 坷幅 惯积
//		scores[-1] = 44; 坷幅 惯积
		
		// 规过 1
		int[] newScores = new int[10];
		for(int i=0; i<5; i++) {
				newScores[i] = scores[i];
		}
		System.out.println(Arrays.toString(newScores));
		
		// 规过 2
		int[] newScores2 = Arrays.copyOf(scores, scores.length * 2);
		System.out.println(Arrays.toString(newScores2));
		
	}
}
