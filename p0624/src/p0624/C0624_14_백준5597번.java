package p0624;

import java.util.Scanner;

public class C0624_14_백준5597번 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[30];
		
		for(int i=0;i<28;i++) {
			int num = scan.nextInt();
			arr[num-1] = 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(i+1);
			}
		}
	}

}
