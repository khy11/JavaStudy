package ch01;

import java.util.Scanner;

public class P81N8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		//나눗셈 연산 사용하는 법
		int num1 = a/100; //100의자리
		int num2 = (a%100)/10; //10의자리
		int num3 = a%10; //일의자리
		int sum = num1 + num2 +num3;
		System.out.println("각 자리 수의 합 : " + sum);
		
	}

}
