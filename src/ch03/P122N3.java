package ch03;

import java.util.Scanner;

public class P122N3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int even = 0; 
		 do {
			 System.out.print("양의 정수를 입력하세요 :");
			 int num = sc.nextInt();
			 
			 if(num%2==0)
				 even += num;
			 
			 else if(num<=0)
				 break;
			 
		 } while(true);
		 System.out.printf("입력된 짝수의 합은 : "+ even);
	}
}