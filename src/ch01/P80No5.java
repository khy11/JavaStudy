package ch01;

import java.util.Scanner;

public class P80No5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 소문자를 입력하세요 : ");
		
		char c = sc.nextLine().charAt(0); //대문자가 소문자 앞에 있다
		int a = (int)'A' -(int)'a'; //대문자와 소문자의 정수값 차이 => 문자열을 정수로 변환 
		char Chapital = (char)((int) c+a); // 정수로 차이값 계산 후 다시 문자열로 출력 
		
		System.out.println(Chapital);
	}

}
