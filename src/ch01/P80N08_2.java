package ch01;

import java.util.Scanner;

public class P80N08_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 : ");
		String a = sc.nextLine(); //문자열로 받음
		
		for(int i=0; i<= a.length(); i++) { //입력받은 정수를 문자열로 변환해서 길이구함
			int sum = Integer.parseInt(a.substring(i,i+1));//문자열을 다시 정수로 변환
			System.out.println(sum);
		}
		
	}

}
