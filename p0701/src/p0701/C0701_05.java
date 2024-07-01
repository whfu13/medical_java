package p0701;

public class C0701_05 {

	public static void main(String[] args) {
		// 프로그램: 실행 가능한 파일
		// 프로세스: 실행중인 프로그램(메모리) - 자원과 쓰레드로 구성
		// 쓰레드: 프로세스 내에서 실제 작업을 수행
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();
	}

}
