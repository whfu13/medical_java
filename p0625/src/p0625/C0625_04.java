package p0625;

import introduce.ComInfo;
import introduce.Info;

public class C0625_04 {

	public static void main(String[] args) {
		// 접근 제어자 - 멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한
		// 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
		// private: 같은 클래스 내에서만 접근이 가능(다른 클래스에서 사용할려면 객체선언 후 사용 가능)
		// default: 같은 패키지 내에서만 접근이 가능
		// protected: 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능
		// public: 접근 제한이 전혀 없다.
		Info i = new Info();
		
		ComInfo c = new ComInfo();
		
	}

}
