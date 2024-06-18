package p0618;

import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		// 로또 번호 생성, 섞기, 6개의 숫자를 출력
		// 1-45 => 6개 뽑아야 함.
		Scanner scan = new Scanner(System.in);
		
		// 1. 45개의 배열 생성
		int[] ball = new int[45];
		
		// 2. 반복문을 사용해서 1-45까지 숫자 입력
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
	
		// 3. 랜덤으로 섞기
		int no = 0;
		int value = 0;
		
		for(int i=0;i<100;i++) {
			no = (int)(Math.random()*45);
			value = ball[0];
			ball[0] = ball[no];
			ball[no] = value;
			
		}
	
		// 4. my 로또번호 입력
		int[] myArr = new int[6];
		for(int i=0;i<myArr.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45번까지 숫자)>> ",i+1);
			myArr[i] = scan.nextInt();
			
		}System.out.print("입력한 숫자 : ");
		
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		
		// 5. 로또번호 출력
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	
	}
	

}
