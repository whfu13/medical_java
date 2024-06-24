package p0624;

import java.util.Scanner;

public class Calculate {
	static Scanner scan = new Scanner(System.in);
	
	// 메소드 1개를 사용해서 처리하는 방법
	void change(int[] score) {
		System.out.println("변경국어점수를 입력하세요."+score[0]);
		score[0] = scan.nextInt();
		
		System.out.println("변경영어점수를 입력하세요."+score[1]);
		score[1] = scan.nextInt();
		
		System.out.println("변경수학점수를 입력하세요."+score[2]);
		score[2] = scan.nextInt();
		
		
		
		
//	void change(int kor,int eng,int math) {
//		System.out.println("변경국어점수를 입력하세요."+kor);
//		kor = scan.nextInt();
//		
//		System.out.println("변경영어점수를 입력하세요."+eng);
//		eng = scan.nextInt();
//		
//		System.out.println("변경수학점수를 입력하세요."+math);
//		math = scan.nextInt();
//		
//		System.out.println("변경할 국어점수 : "+kor);
//		System.out.println("변경할 영어점수 : "+eng);
//		System.out.println("변경할 수학점수 : "+math);
		
	}
	
	int korChange(int kor) {
		System.out.println("변경할 국어점수를 입력하세요."+kor);
		kor = scan.nextInt();
		return kor;
	}
	
	int engChange(int eng) {
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 영어점수를 입력하세요."+eng);
		eng = scan.nextInt();
		return eng;
	}
	int mathChange(int math) {
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 수학점수를 입력하세요."+math);
		math = scan.nextInt();
		return math;
	}
	
	
	
	
//	int result = 0;
//	// cal()
//	// return result; 사용할 것
//	
//	int cal(int[] arr,String str) {
//		
//		switch(str) {
//		
//		case "+":
//			result = arr[0]+arr[1];
//			break;
//		case "-":
//			result = arr[0]-arr[1];
//			break;
//		case "*":
//			result = arr[0]*arr[1];
//			break;
//		case "/":
//			result = arr[0]/arr[1];
//			break;
//			
//		}
//		
//		return result;
//	}
}
