package ch03;

public class P124N8 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
		//기존 swtich문으로 팩토리얼 프로그램 작성
		return switch(n) // 아래 case문을 실행한 값이 n에 저장되고 n값은 다시 factorial로 전송 
         {
            case 0 -> 1;
            case 1 -> 1;
            default -> factorial(n-1)*n;
		  } ;
	 }
}
