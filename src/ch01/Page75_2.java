package ch01;

import java.util.Scanner;

public class Page75_2 {

	public static void main(String[] args) {
		String y;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int a =sc.nextInt();
		y = (a%2==0) ? "짝수" : "홀수"; //조건연산자
		
		System.out.println(y);
		sc.close();
	}

}
