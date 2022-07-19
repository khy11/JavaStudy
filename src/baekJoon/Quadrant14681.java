package baekJoon;

import java.util.Scanner;

public class Quadrant14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수나 음수 숫자 하나를 기입하세요 X : ");
		int x = sc.nextInt();
		System.out.print("양수나 음수 숫자 하나를 기입하세요 Y : ");
		int y = sc.nextInt();
		
		if(x>0)
			if(y>0)
				System.out.println("1");
			else
				System.out.println("4");
		else
			if(x<0)
				System.out.println("3");
			if(y<0)
				System.out.println("2");
		sc.close();
	}

}
