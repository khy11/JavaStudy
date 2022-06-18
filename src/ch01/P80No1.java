package ch01;

public class P80No1 {

	public static void main(String[] args) {
		//프로그래밍 문제 p80 1번 
		for(int i=1; i<=6; i++) {
			for(int j=0; j<=(6-i); j++)
				System.out.print(" ");
			
				for(int k=1; k<=(i*2)-1; k++)
					System.out.print("*");
				
				System.out.println();
		}
	}
}