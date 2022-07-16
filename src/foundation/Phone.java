package foundation;

public class Phone {
	
		private String os; //인스턴스 변수선언
		private String color; // 인스턴스 변수선언
		
		public void setOs (String os) { //setOs라는 메서드 생성
			//Phone클래스에 의해 생성된 인스턴스 (this)를 호출해서 같은 이름인 os라고 다시 지칭해줌
			this.os = os;
		}
	
		public static void main(String[] args) { //구현이 되는 main 메서드
		  
	    Phone iPhone13 = new Phone(); // new생성자 선언 (인스턴스화) 
		Phone galaxyS20 = new Phone(); // new생성자 선언 (인스턴스화) 
		//결과는 nullpointException 발생 => 메서드로 인스턴스변수를 구현시켜야함
		
		iPhone13.setOs("ios");
		//iPhone13이라는 객체에 인스턴스 메서드(인스턴스 변수 값) 대입 
		System.out.println(iPhone13.os); // 객체.인스턴스 변수를 출력 
	  } 
	}
