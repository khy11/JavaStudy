package basic;

public class Method {

	public static void main(String[] args) { //main이라는 메소드
		/* add(5,4); */// add메소드를 호출해서 사용
		System.out.println(add(1,2,3,4,5));
		
		Hero hero = new Hero("슈퍼맨");
		//hero클래스 isflying은 boolean값이므로 get~();대신 메서드 사용
		//hero.isFlying();
		
		System.out.println(hero.getName()+"과 전쟁을 했다");
	
	}
	
	/*
	 * public static void add(int x, int y) { // add라는 메소드로 파라미터로 x,y를 가짐
	 * System.out.println(x + y); // add메소드는 int x와 y를 더한 값 }
	 * 
	 * // 리턴타입 public static int plus (int s, int ss) { return s + ss; } public
	 * static int add(int x, int y, int z) { return x+y+z; }
	 */
	
	public static int add(int ... numbers) { // 0개부터 배열값이 들어올 수 있음
		int sum = 0;
		for (int i =0; i< numbers.length; i++ ) {
			sum = sum + i;
		}
		return sum;
		}
}
