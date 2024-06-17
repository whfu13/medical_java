package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		
		// 1부터 10까지 랜덤숫자를 생성해서
		// 숫자 1개를 입력받아 정답인지 아닌지 출력하시오.
		// 같으면 당첨, 다르면 꽝이라고 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println(Math.random());
		System.out.println("숫자를 입력하세요.>>");
		int n = (int)(Math.random()*10)+1;
		int input = scan.nextInt();
		if(input==n) {
			System.out.println("당첨입니다");
		}else {
			System.out.println("꽝");
		}
		
		
//		Math.random(); // 0.0<= x && x < 1.0
//		System.out.println(Math.random());
//		
//		// 1부터 100까지 숫자를 랜덤으로 생성해서 출력하시오.
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		// 1부터 3까지 랜덤숫자 생성해서 출력하시오.
//		int num1 = (int)(Math.random()*3)+1;
//		System.out.println(num1);
//
//		// 1부터 45까지 랜덤숫자 생성해서 출력하시오.
//		int num2 = (int)(Math.random()*45)+1;
//		System.out.println(num2);
//		
		
		
//		// 1-10까지 랜덤숫자를 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		// 0-9까지
//		int n = (int)(Math.random()*10);
//		
//		// 2-10까지
//		int n2 = (int)(Math.random()*9)+2;
//		
//		//1-100까지 생성출력
//		int num1 = (int)(Math.random()*100)+1;
//		System.out.println(num1);
//		
//		//0-4까지 출력
//		int num2 = (int)(Math.random()*5);
//		System.out.println(num2);
//		//0-19까지 출력
//		int num3 = (int)(Math.random()*20);
//		System.out.println(num3);
	}

}
