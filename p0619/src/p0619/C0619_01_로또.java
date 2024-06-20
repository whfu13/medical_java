package p0619;

import java.util.Scanner;

public class C0619_01_로또 {

	public static void main(String[] args) {
		
		// 로또 프로그램 구현
		// 1-45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		// 입력한 입력번호 6개
		// 당첨번호 개수 배열, 카운트 변수
		// 모든 배열을 출력
		Scanner scan = new Scanner(System.in);
		
		// 1. 45개 배열을 생성
		int[] ball = new int[45]; // 0-44
		for(int i=0;i<45;i++) {
			ball[i] = i+1; // 1-45
		}
		
		// 2. ball 배열 섞기
		int no = 0;		 // 0번째 배열과 바꿀 배열번호
		int t_value = 0; // 임시적으로 저장하는 공간
		
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*45); // 0-44
			
			t_value = ball[0];
			ball[0] = ball[no];	// 랜덤값을 0번째 배열에 입력
			ball[no] = t_value;
		}
		
		// 3. my_ball 입력: 6개의 로또번호
		int[] my_ball = new int[6];
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 로또번호를 입력하세요.>> ",i+1);
			my_ball[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("[ 로또번호 현황 ]");
		System.out.println("---------------------------");
		
		// 4. my_ball 출력
		System.out.println("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%4d",my_ball[i]);
		}
		System.out.println();
		
		
		
		// 5. ball 배열 출력
		System.out.println("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%4d",ball[i]);
		}
		System.out.println();
		
		
		// 6. 당첨개수
		int[] Lotto = new int[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(ball[i]==my_ball[j]) {
					Lotto[count] = ball[i];
					count ++;
					break;
				}
			}
		}
		
		System.out.printf("당첨개수 : %d개 \n ",count);
		
		// 7. 당첨번호 출력
		System.out.print("당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%4d",Lotto[i]);
		}
		
		if(count==0) {
			System.out.println("없음");
		}
		
		System.out.println();
		
		
		
		
		
		
		
//		//--------------2차원 배열 입력---------------
//		int[][] arr = new int[5][5];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		//--------------출력---------------
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//		}
//		System.out.println();
		
		
		
	}

}
