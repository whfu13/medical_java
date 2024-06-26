package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		// Tv 구매
		Product t = new Tv();
		Product t2 = new Tv();
		b.buy(t); 		 // TV 1대 구매
		b.buy(t2); // TV 1대 구매
		
		// 컴퓨터 구매
		Product c = new Computer();
		b.buy(c);
		
		// 오디오 구매
		Product a = new Audio();
		b.buy(a);
		
		// 냉장고 구매
		Product r = new Refrigerator();
		b.buy(r);
		
		// cart 제품명, 가격을 출력하시오.
//		b.cart : 배열
		// b.list
		System.out.println("[ 구매내역 ]");
		int sum = 0;
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.println(p.pName);
			sum += p.price;
		}
		System.out.println("총 구매 개수 : "+b.list.size());
		System.out.println("총 구매금액 : "+sum);
	}

}
