package p0624;

import java.util.Scanner;

public class C0624_13_백준2475번 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	        int result = 0;
	        for (int i=0; i<5; i++) {
	            int num = scan.nextInt();
	            result += num*num;
	        }
	        System.out.println(result%10);

	    }
	}