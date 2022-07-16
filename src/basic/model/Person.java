package basic.model;

public class Person { //클래스 생성 ( 속성, 기능)
		private String name; //접근지정자 private로 외부접근 방지 
		private int age;
		
		//1. 기본 생성자
		public Person() { //생성자는 클래스이름과 일치하는 기본 생성자 
			
		}
		//2. 오버로딩 생성자 
		public Person(String name, int age) { //필드를 받아 오버로드된 생성자
			this.name = name; //필드를 받아서 초기화 (외부에서 name이라는 변수를 통해 넘어온 값) 
			this.age = age;
		}
		
		//getter , setter를 통해 외부에서 데이터를 쓸 수 있게 만듦
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		
	}
}
