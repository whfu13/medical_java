package p0624;

import java.util.Scanner;

public class C0624_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 5;
		int[] result = new int[4];
		// Element 의 메소드를 활용해서
		// a,b의 사칙연산 결과값을 출력하시오.
		// cal(a,b)
		Element e = new Element();
		e.allCal(a,b,result);
		
		System.out.println("더하기 값 : "+result[0]);
		System.out.println("빼기 값 : "+result[1]);
		System.out.println("곱하기 값 : "+result[2]);
		System.out.println("나누기 값 : "+result[3]);
	}


}
