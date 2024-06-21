package p0621;

public class Cal2 {
	
	void cal(int a, int b, double[] arr) {
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		arr[3] = a/(double)b;
		
	}
	
	// 리턴타입 메소드명(매개변수){ return
	int plus(int a, int b) {
		return a+b;
	}

	int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	int divide(int a, int b) {
		return a/b;
	}
}
