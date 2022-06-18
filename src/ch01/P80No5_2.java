package ch01;

import java.util.Scanner;

public class P80No5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 소문자를 입력하세요");
		
		String a = sc.nextLine();
		String substr = a.toUpperCase();
		System.out.println(substr);
	}

}
