package ch01;

import java.util.Scanner;

public class P80No3 {

	public static void main(String[] args) {
		 double r,h, volume;
		 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("원기둥의 밑면 반지름은? ");
		 
		 r = sc.nextDouble();
		 System.out.print("원기둥의 높이는? ");
		 
		 h = sc.nextDouble();
		 volume = 3.14*(r*r)*h;
		 
		 System.out.println("원기둥의 부피는? "+ volume);
	}

}
