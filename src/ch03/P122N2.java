package ch03;

import java.util.Scanner;

public class P122N2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수를 입력하세요 : ");
		
		int grade = sc.nextInt();
		
		//개선된 switch문 사용하기 
		switch(grade) {
			case 1 -> System.out.println("아주 잘했습니다.");
			
			case 2,3 -> System.out.println("잘했습니다.");
			
			case 4,5,6 -> System.out.println("보통입니다.");
			
			default -> System.out.println("노력해야겠습니다.");
		}
	}
}


