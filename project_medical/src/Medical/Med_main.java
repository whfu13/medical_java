package Medical;

import java.util.ArrayList;
import java.util.Scanner;

public class Med_main {
	
	public static void main(String[] args) {
		Med_process m = new Med_process();
		ArrayList<SampleData> dataset = new SampleData().get_dataset();
		String medNo="",name="",address="";
		int facility_code= 0, region_scode=0;
		int choice = 0;
		
		
		loop1: while (true) {
			choice = m.screen(dataset);
				
			switch(choice) {
			case 1: // 요양시설 정보입력
				m.med_input(dataset);
				break;
				
			case 2: // 요양시설 정보출력
				m.med_output(dataset);
				break;
				
			case 3: // 요양시설 검색
				m.med_search(dataset);
				break;
				
			case 0: // 프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
//				
	}// switch
			
} // while
			
		
	
} // main
	
		
}// class