package ch03;

import java.util.Scanner;

public class P123N6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		
		String m = sc.nextLine();
		System.out.print("영희 : ");
		
		String w = sc.nextLine();		
		
		// 가위:s 바위:r 보:p
		if((m.equals("s") && w.equals("p")) || (m.equals("r") && w.equals("s")) || (m.equals("p") && w.equals("r"))) {//철수가 이겼을 경우
			System.out.print("철수,승!");
		}	
		else if((w.equals("s") && m.equals("p")) || (w.equals("r") && m.equals("s")) || (w.equals("p") && m.equals("r"))) { //철수가 이겼을 경우
			System.out.print("영희,승!");
		}
		else{
			System.out.print("비겼습니다.");
		}
	}

}
