package day0328;

public class test_continue {
	public static void main(String[] args) {
//		for(int i =0; i<10; i++) {
//			if(i==3) continue;
//			System.out.println(i);
//		}
		
		outer: for(int i=0; i<3; i++) { //outer -> 라벨
			for(int j=0; j<3; j++) {
				if(i==1) continue outer;
				System.out.println(i+","+j); // 숫자하고 문자 더하면 문자열
			}
		}
	}
}
