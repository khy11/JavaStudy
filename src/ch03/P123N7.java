package ch03;

import java.util.Scanner;

public class P123N7 {

	public static void main(String[] args) {
		   String c = input("철수");
		   String y = input("영희");
		   whosWin(c,y);
		}
	
		//철수와 영희 이름을 받는 메서드 생성
		public static String input(String n) {
			Scanner sc = new Scanner(System.in);
			System.out.printf(n+": ");
			n = sc.next();
			
			return n;
		}
		
		// 가위:s 바위:r 보:p
		public static void whosWin(String c, String y) {
		if((c.equals("s") && y.equals("p")) || (c.equals("r") && y.equals("s")) || (c.equals("p") && y.equals("r"))) {//철수가 이겼을 경우
			System.out.print("철수,승!");
		}	
		else if((y.equals("s") && c.equals("p")) || (y.equals("r") && c.equals("s")) || (y.equals("p") && c.equals("r"))) { //철수가 이겼을 경우
			System.out.print("영희,승!");
		}
		else{
			System.out.print("비겼습니다.");
			}
		}	
}
