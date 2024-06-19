package p0619;

import java.util.Scanner;

public class C0619_02 {

	public static void main(String[] args) {
		// 1-45까지 로또번호를 생성해서, 랜덤으로 섞은 후, 출력하시오
		Scanner scan = new Scanner(System.in);
		
		// 1. 로또번호 입력
		int[] ball = new int[25];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;		
		}
		// 2. 랜덤으로 섞기
		int no = 0;
		int t_value = 0;
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*25);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		// 3. 로또번호 출력
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		//1-25까지 번호를 넣고, 랜덤으로 섞은 후 출력하시오
		//[5,5] 출력
		int[][] arr = new int[5][5];
		
		// 2차원 배열 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}
		
		// 2차원 배열 섞기
		int no2 = 0;		
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*25);
			no2 = (int)(Math.random()*25);
			
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		
		// 2차원 배열 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
		}
		System.out.println();
		
		
		
		
		
		}

}
