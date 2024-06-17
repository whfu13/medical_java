package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력받아, 90점 이상 A, 80점 이상 B,C,D,F를 출력할 수 있게 구현
		// 90~92점 A-, 97~100 A+, 80~82점 B-, 87~89 B+
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scan.nextInt();
		String score = "";
		if(num>=90) {
			score = "A";
			if(num>=97) score = score+"+";
			else if(num<=92)score = score+"-";
		}else if(num>=80) {
			score = "B";
			if(num>=87) score = score+"+";
		}else if(num<=82)score = score+"-";
		else if(num>=70) {
			score = "C";
			if(num>=77) score = score+"+";
		}else if(num<=72)score = score+"-";
		else if(num>=60) {
			score = "D";
			if(num>=67) score = score+"+";
		}else if(num<=62)score = score+"-";
		else
			score = "F";
		
		System.out.println("학점 : "+score);
		
		// 점수를 입력받아, 90점 이상 A, 80점 이상 B,C,D,F를 출력할 수 있게 구현
		// 90~92점 A-, 97~100 A+, 80~82점 B-, 87~89 B+
	}

}
