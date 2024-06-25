package p0625;

public class C0625_01 {

	public static void main(String[] args) {
		// 상속 - 기존의 클래스를 재사용해서 새로운 클래스를 작성
		//	   - 두 클래스를 조상과 자손으로 관계를 맺어주는 것
		
		// 포함 - 한 클래스의 멤버변수로 다른 클래스를 선언
		// 작은 단위의 클래스를 먼저 만들고, 이들을 조합해서 하나의 커다란 클래스를 만듬
		
		// Object 클래스 - 모든 클래스의 최고조상
		// 조상이 없는 클래스는 자동적으로 Object 클래스를 상속받게된다.
		// 상속계층도의 최상위에는 Object 클래스가 위치한다.
		// 모든 클래스는 Object 클래스에 정의된 11개의 메서드를 상속받는다.
		
		// 오버라이딩 - 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경
		
		// this - 인스턴스 자신을 가리키는 참조변수
		// 		- 인스턴스의 주소가 저장되어있음
		//		- 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
		
		// super - this와 같음. 조상의 멤버와 자신의 멤버를 구별하는데 사용
		
		// 다형성 - 여러가지 형태를 가질 수 있는 능력
		//		- 하나의 참조변수로 여러 타입의 객체를 참조
		//		- 즉, 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것
	
		Circle c1 = new Circle(); // 기본생성자 호출
		System.out.println("반지름 : "+c1.r);
		// 원의 중심축을 출력하시오.
		System.out.printf("원점 : (%d,%d) \n ",c1.center.x,c1.center.y);
		
		Circle c2 = new Circle(new Point(150,150),50);
		System.out.println("반지름 : "+c2.r);
		System.out.printf("원점 : (%d,%d) \n ",c2.center.x,c2.center.y);
		c2.draw();
		
		int[] a = {1,2,3};
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		
		Point[] p = {p1,p2,p3};
		Triangle t1 = new Triangle(p);
		
		Point[] p4 = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t2 = new Triangle(p4);
		
		Triangle t3 = new Triangle(new Point(0,0),new Point(100,100),new Point(50,50));
		
		
		
		
//		Point3D p = new Point3D();
//		p.x = 100;
//		System.out.println("p.x : "+p.x);
//		
//		Point p2 = new Point();
	}

}
