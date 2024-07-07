package medical;

import java.util.ArrayList;
import java.util.Scanner;

public class med_process {
	Scanner scan = new Scanner(System.in);
	ArrayList<SampleData> list = new ArrayList<SampleData>();
	String[] title = {"이름","주소","시설코드","지역코드"};
	String name,address,facility_code,region_code;
	int choice;

	// 요양시설 검색창 화면 메소드
	int screen(ArrayList list) {
		System.out.println("[ 요양시설 ]");
		System.out.println("---------------------");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 회원정보수정");
		System.out.println("4. 비밀번호변경");
		System.out.println("5. 회원탈퇴");
		System.out.println("6. 회원정보저장");
		System.out.println("0. 회원가입종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	}
	
	}