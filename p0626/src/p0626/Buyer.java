package p0626;

import java.util.ArrayList;

public class Buyer {
	String userId;
	String userPw;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10]; // 인스턴스 변수
	ArrayList list = new ArrayList(); // 객체배열선언
//	int count; // 인스턴스 변수
	Buyer(){}
	Buyer(String userId,String userPw,int money,int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 구매메소드 - 부모의 참조변수
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액 부족 (보유 금액 : %d 만원) \n",money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // 객체배열 추가 - add()
//		cart[count++] = p; // 구매물품 저장 
		System.out.printf("%s 제품을 구매했습니다.(보유금액 : %d 만원) \n",p.pName,money);
	}
	
}
