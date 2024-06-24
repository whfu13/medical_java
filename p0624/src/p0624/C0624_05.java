package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두개의 수와 1개의 사칙연산 +,-,*,/을 입력받아
		// 결과값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>");
		int x = scan.nextInt();
		System.out.println("숫자를 입력하세요 >>");
		int x2 = scan.nextInt();
		
		// 인스턴스메소드 = 객체선언 후, 참조변수명.메소드명
		
		// cal() 메소드를 사용해서 구현하시오.
		
	
		int[] arr = new int[2];
		
		for(int i=0;i<2;i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scan.nextInt();
	}
		System.out.println("사칙연산을 입력하세요 >>");
		String str = scan.next();
	
		Calculate c = new Calculate();
//		int result = c.cal(arr, str);
		}
		

}

//		int result = 0;
//		switch(str) {
//		
//		case "+":
//			result = x+x2;
//			break;
//		case "-":
//			result = x-x2;
//			break;
//		case "*":
//			result = x*x2;
//			break;
//		case "/":
//			result = x/x2;
//			break;
//			
//		}