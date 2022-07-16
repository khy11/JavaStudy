package foundation;

public class Card {
	String type;
	String color;
	int cvc;
	
	//2. 카드의 타입알아내는 메서드 생성
	Card(String t, String c, int cvc) {
		type = t;
		color = c;
		this.cvc = cvc;
	}
	
	public static void main(String[] args) { //구현하는 메서드
	//매개변수가 있는 생성자로 만들기
		Card c = new Card("credit","orange",456);
		
		System.out.println("[ 카드 타입 : " + c.type + " 카드 색깔 : " + c.color + " 카드 cvc : " + c.cvc + " ]");
		
	}

}