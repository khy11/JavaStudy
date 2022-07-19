package baekJoon;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Gugudan2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<= 9; i++ )
			System.out.print(N + " * " + i + " = "  + N*i);
			
	}

}
