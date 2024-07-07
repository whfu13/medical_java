package medical;

import java.util.ArrayList;
import java.util.Scanner;

public class med_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		ArrayList<SampleData> dataset = new SampleData().get_dataset();
		
		Loop1 : while(true) {
			System.out.println("1. 강남구");
			System.out.println("2. 강동구");
			System.out.println("3. 강북구");
			System.out.println("4. 강서구");
			System.out.println("5. 관악구");
			System.out.println("6. 광진구");
			System.out.println("7. 구로구");
			System.out.println("8. 금천구");
			System.out.println("9. 노원구");
			System.out.println("10. 도봉구");
			System.out.println("11. 동대문구");
			System.out.println("12. 동작구");
			System.out.println("13. 마포구");
			System.out.println("14. 서대문구");
			System.out.println("15. 서초구");
			System.out.println("16. 성동구");
			System.out.println("17. 성북구");
			System.out.println("18. 송파구");
			System.out.println("19. 양천구");
			System.out.println("20. 영등포구");
			System.out.println("21. 용산구");
			System.out.println("22. 은평구");
			System.out.println("23. 종로구");
			System.out.println("24. 중구");
			System.out.println("25. 중랑구");
			System.out.println("26. 인천");
			System.out.println("27. 경기 북부");
			System.out.println("28. 경기 남부");
			System.out.println("29. 경기 서부");
			System.out.println("30. 경기 동부");
			System.out.println("지역을 선택해주세요. >> ");
			
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				String search = "강남";
				for(int i=0; i<dataset.size(); i++) {
					String address = dataset.get(i).getName();
					if(address.contains(search)) {
						System.out.println(address);
					}
				}
				break;
			case 2 :
				String search1 = "강동";
				for(int i=0; i<dataset.size(); i++) {
					String address = dataset.get(i).getName();
					if(address.contains(search1)) {
						System.out.println(address);
					}
				}
				break;
			case 3 :
				String search2 = "강북";
				for(int i=0; i<dataset.size(); i++) {
					String address = dataset.get(i).getName();
					if(address.contains(search2)) {
						System.out.println(address);
					}
				}
				break;
			
			
			}//switch
		
		}//while

	}//main

	private static char[] address(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}//class