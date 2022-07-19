package baekJoon;

import java.util.Scanner;

public class AplusB10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수 
		for(int i = 0; i < T; i ++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.print(A+B);
		}
	}

}
