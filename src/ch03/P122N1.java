package ch03;

import java.util.Scanner;

public class P122N1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int age = sc.nextInt(); 
		if(age >= 19) {
			System.out.print("성년");
		}else
		System.out.print("미성년");
	}

}
