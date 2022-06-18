package ch01;

import java.util.Scanner;

public class P80No4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 ");
		int a = sc.nextInt();
		
		// 2000초 -> 시간 / 2000초 -> 분 / 2000초 -> 초
		int h,m,s;
		h = a /(60*60); m = a/60 ; s = a%m;
		System.out.println(h+"시간"+m+"분"+s+"초");
	}

}
