package ch01;

import java.util.Scanner;

public class P81N9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이수한 전공 학점을 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("이수한 교양 학점을 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("이수한 일반 학점을 입력하세요 : ");
		int c = sc.nextInt();
		
		if(a+b+c>=140) { //1번
			if(a>=70){ //2번
			 if(((b>=30)&&c>=30) || b+c>=80) { //3번
				 System.out.println("졸업가능");  // 1,2,3을 모두 충족시
			   }
			 
             else
                 System.out.print("졸업 불가"); // 1,2번 충족 3번 불충족시
         }
			
         else
             System.out.print("졸업 불가"); // 1번 충족 2번 불충족
     }
		
     else
         System.out.print("졸업 불가"); // 1번 불충족시 
	}
}