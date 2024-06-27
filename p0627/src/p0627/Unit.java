package p0627;

abstract public class Unit {
	
	int hitPoint;	  // 현재 체력
	final int MAX_HP; // 최대 체력
	
//	Unit(){}
	
	
	Unit(int hP){
		MAX_HP = hP;
	}
	
	
	int x,y;
//	abstract void move(int x,int y); // 추상 메소드, 메소드 구현 {}
	void stop() {
		
	}
}
