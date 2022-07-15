package ch01;

import java.util.Scanner;

public class P81No6 {

	public static void main(String[] args) {
		double C,F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도(F)를 입력하세요 : ");
		
		F = sc.nextDouble();
		C = (5*(F-32))/9;
		
		System.out.println("섭씨온도는 " + C +"입니다");
		
	}

}
