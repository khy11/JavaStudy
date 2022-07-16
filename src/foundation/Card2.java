package foundation;

public class Card2 {
	String type;
	String color;
	int cvc;
	
	//2. 카드의 타입알아내는 메서드 생성
	public void setCard (String type, String color, int cvc) {
		this.type = type;
		this.color = color;
		this.cvc = cvc; 
	}	
	
	public static void main(String[] args) { //구현하는 메서드
		Card2 c = new Card2(); // 생성자 선언 및 초기화
		
		//카드의 타입이 알고싶다
		//1. 인스턴스 변수.카드의 타입을 알아내는 메서드("타입명"); 
		c.type = "credit";
		c.color ="orange";
		c.cvc = 456; 
		
		
		System.out.println("[ 카드 타입 : " + c.type + " 카드 색깔 : " + c.color + " 카드 cvc : " + c.cvc + " ]");
		
	}

}
