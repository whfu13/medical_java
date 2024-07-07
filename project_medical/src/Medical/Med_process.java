package Medical;

import java.util.ArrayList;
import java.util.Scanner;

public class Med_process {
	Scanner scan = new Scanner(System.in);
	String[] title = {"시설번호","시설명","주소","시설코드","지역코드"};
	String medNo,name,address;
	int facility_code,region_code;
	int choice;

	// 요양시설 검색창 화면 메소드
	int screen(ArrayList<SampleData> dataset) {
		System.out.println("[ 요양시설 검색 ]");
		System.out.println("----------------------------");
		System.out.println("1. 요양시설입력");
		System.out.println("2. 요양시설출력");
		System.out.println("3. 요양시설검색");
		System.out.println("0. 프로그램종료");
		System.out.println("----------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
		
	}// screen
	
	// 요양시설 입력 부분 메소드
	void med_input(ArrayList<SampleData> dataset) {
		while(true) {
			System.out.println("요양시설 입력을 시작합니다.");
			System.out.println("시설코드를 입력하세요>>(0.이전페이지 이동)");
			name = scan.nextLine();
			
			if(name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}
			
			// dataset 저장
			dataset.add(new SampleData(name,address,facility_code,region_code));
			
			
		}// while
	}// med_input
	
	// 요양시설 출력 부분 메소드	
	void med_output(ArrayList<SampleData> dataset) {
		System.out.println(" [ 요양시설 출력 ]");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		
		if(dataset.size()==0) {
			System.out.println("< 찾는 요양시설이 없습니다. >");
			System.out.println();
			return;
		}
		for(int i=0;i<dataset.size();i++) {
			SampleData s = (SampleData) dataset.get(i);
			System.out.printf("%s\t%s\t%s\t%d\t%d\t \n",
					s.getMedNo(),s.getName(),s.getAddress(),s.getFacility_code(),s.getRegion_code());
		System.out.println();
	}
		
	} // med_output
	// 시설코드 검색 메소드
	void med_search(ArrayList<SampleData> dataset) {
		System.out.println("[ 요양시설 시설코드 검색 ]");
		System.out.println("----------------------------");
		System.out.println("1. 요양원 검색");
		System.out.println("2. 요양병원 검색");
		System.out.println("3. 실버타운 검색");
		System.out.println("----------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine();
		int cnt = 0;
		ArrayList med_searchList = new ArrayList();
		int search_fc = 0;
		int search_fc1 = 0;
		int search_fc2 = 0;
		
		
		switch(choice) {
		
		case 1:  // 요양원 검색
			System.out.println("요양원 시설코드를 입력하세요.>>");
			search_fc = scan.nextInt();
			
			for(int i=0;i<dataset.size();i++) {
				SampleData s = (SampleData) dataset.get(i);
				if(s.getFacility_code()== search_fc) {
					med_searchList.add(s);
				}
			}
			break;
			
		case 2: //  요양병원 검색
			System.out.println("요양병원 시설코드를 입력하세요>>");
			search_fc1 = scan.nextInt();
			
			for(int i=0;i<dataset.size();i++) {
				SampleData s = (SampleData) dataset.get(i);
				if(s.getFacility_code()== search_fc1) {
					med_searchList.add(s);
				}
			}
			break;
			
		case 3: // 실버타운 검색
			System.out.println("실버타운 시설코드를 입력하세요>>");
			search_fc2 = scan.nextInt();
			
			for(int i=0;i<dataset.size();i++) {
				SampleData s = (SampleData) dataset.get(i);
				if(s.getFacility_code()== search_fc2) {
					med_searchList.add(s);
			}
		}
			break;
	}
		
		// 요양시설 출력 메소드 호출
		med_output(med_searchList);
		
	}//med_search
		
	} // class