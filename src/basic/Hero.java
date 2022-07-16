package basic;

import basic.model.Person;

public class Hero extends Person { //Person 클래스를 상속받음(name,age를 기본적으로 지니면서)
	
	public Hero(String name) {
	//	super(name);
	}
	
	private boolean isFlying; //날아다니는지 여부

	public boolean isFlying() { //구현은 Method Main에서 구현
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	public void attack(Hero hero) {
		
	}

}
