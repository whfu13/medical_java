package p0701;

public class Card {
	private String password;
	private int number;
	private String kind;
	
	Card(){} // 기본생성자
	Card(int number,String kind){ // 전체생성자
		this.number = number;
		this.kind = kind;
	}
	public String getPassword(String id) {
		if(!(id.equals("admin"))) {
			return "";
		}
		return password;
		
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumber() {
		return number;
		
	}

	public void setNumber(int number) {
		if(number>13 || number<0) {
			return;
		}
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return kind+","+number;
	}
	
	
}

