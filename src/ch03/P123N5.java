package ch03;

public class P123N5 {

	public static void main(String[] args) {
		//피라고라스 공식 : a^2 + b^2 = c^2 
		for(int a = 1; a < 20; a ++){// 삼각형 a변 길이
			
			for(int b = 1; b < 20; b ++){ //삼각형 b변 길이
				
				for(int c = 1; c < 20; c ++){ //삼각형 c변 길이
					
                    if ((a * a + b * b == c * c) && (a + b + c <= 20)) {
                    	
					System.out.printf("각 변의 길이는 %d,%d,%d",a,b,c);				
                    }
                 }
			 }	
		 }
	}

}
