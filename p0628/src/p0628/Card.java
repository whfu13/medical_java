package p0628;

public class Card {
	
//	enum Kind{ SPADE,DIAMOND,HEART,CLOVER}
	
	private int number;
	private String kind;
	
	Card(){}
	Card(int number,String kind){
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return String.format("%d,%s", number,kind);
	}
	public String getKind() {
		return null;
	}
	
}
