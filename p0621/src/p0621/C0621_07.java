package p0621;

public class C0621_07 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x :" +d.x);
		System.out.println("--------------");
		
		C0621_07 c = new C0621_07();
		change(d.x); // 클래스 메소드 - 객체 선언없이 클래스명.메소드명 사용
		
		System.out.println("change 호출 후 d.x : "+d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change x : "+x);
	}
}
