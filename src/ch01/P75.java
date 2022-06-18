package ch01;

import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		double w,h,area; // 가로 세로 넓이를 받을 변수를 선언 (double)
		Scanner sc = new Scanner(System.in);
			System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = sc.nextDouble(); //스캐너 실수로 받는 메소드는 nextDouble
			System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = sc.nextDouble(); 
		
		area = w*h;
			System.out.print("직사각형의 넓이는 : " + area +"입니다.");
	}

}
