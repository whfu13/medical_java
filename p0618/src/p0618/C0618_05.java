package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		// 5개의 숫자를 모두 입력받은 후, 3번째 숫자만 출력하시오.
		Scanner scan = new Scanner(System.in);
//		int score[] = new int[5]; // 첫번째방법
		int[] score = new int[5]; // 두번째 방법
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		// 배열에 입력
		for(int i=0;i<5;i++) {
			score[i] = i+1;
		}
//		for(int i=0;i<5;i++) {
//			System.out.println("숫자를 입력하세요.>>");
//			score[i] = scan.nextInt();
//		}
		
		System.out.println(score); // score 주소값
		System.out.println(Arrays.toString(score)); // 배열의 모든 데이터 확인 메소드
		
		// 배열 출력
		for(int i=0;i<5;i++) {
			System.out.println(score[i]);
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		
//		int n = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		
//		System.out.println(n3);
	}
	
}
