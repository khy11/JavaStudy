package foundation;

public class Card {
	String type; //인스턴스 변수
	String color;
	int cvc;
	
	//2. 카드의 타입알아내는 메서드 생성
	Card(String type, String color, int cvc) { //매개변수
		this.type = type; // 지역변수(매개변수)
		this.color = color;
		this.cvc = cvc;
	}
	
	public static void main(String[] args) { //구현하는 메서드
	//매개변수가 있는 생성자로 만들기
		Card c = new Card("credit","orange",456);
		
		System.out.println("[ 카드 타입 : " + c.type + " 카드 색깔 : " + c.color + " 카드 cvc : " + c.cvc + " ]");
		
	}

}