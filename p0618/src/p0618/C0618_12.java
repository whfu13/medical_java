package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
		// 3,3, 홍길동, 유관순, 이순신 / 국어,영어,수학성적을 입력받아 출력
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"이름","국어","영어","수학"};
		for(int i=0;i<score.length;i++) {
			System.out.println(title[0]+"을 입력하세요");
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.println(title[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				
			}
		}
		
		// 2명의 학생성적 출력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		for(int i=0;i<3;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
			
		
	}

}
