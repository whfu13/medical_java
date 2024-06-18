package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		// 구구단 4 x 4 = 16
		// while,for 반복문에는 이름 부여 가능
		// 원하는 구간에서 멈출수있음
		loop1:for(int i=2;i<=9;i++) {
			System.out.printf("[ %d 단 ] \n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d \n",i,j,i*j);
				if(i==4 && j==4) {
					break loop1;
				}
			}
		}
	}

}
