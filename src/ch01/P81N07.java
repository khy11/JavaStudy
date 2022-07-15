package ch01;

import java.util.Scanner;

public class P81N07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int X = sc.nextInt();
		if((X % 4 == 0 ) && (X % 5 == 0)) {
			System.out.println("true");
		
		}else {
			System.out.println("false");
		}
		
		if((X % 4 !=0) && (X%5==0) || (X % 4 ==0) && (X%5!=0)) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		
		if((X % 4 == 0 ) || (X % 5 == 0)) {
		 System.out.println("true");
		
		}else {
			System.out.println("flase");
		}
		
	 }
}
