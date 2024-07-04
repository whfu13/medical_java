package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class User_process {
	Scanner scan = new Scanner(System.in);
	String[] title = {"아이디","비밀번호","이름","이메일","전화번호"};
	String useNo,id,pw,name,email,p_num;
	int choice ;
	
	// 로그인창 화면 메소드
	int screen(ArrayList list) {
		System.out.println("[ 회원가입 프로그램 ]");
		System.out.printf("현재 입력된 회원수 : %d 명 \n",list.size());
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
	
	// 회원정보입력 부분 메소드
	void use_input(ArrayList<User> list) {
		while(true) {
			System.out.println("아이디를 입력하세요>>(0.이전페이지 이동)");
			id = scan.nextLine();
			
			if(id.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}
			
			// 아이디 중복체크
			 if(id.contains(id)) {
	                System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 입력하세요.");
	            }else {
	                System.out.println("회원가입이 완료되었습니다.");
	            }
	        }
			
			System.out.println("ID를 입력하세요.>>");
			String id = scan.next();
			System.out.println("PW를 입력하세요.>>");
			String pw = scan.next();
			System.out.println("이름을 입력하세요>>");
			String name = scan.next();
			System.out.println("이메일을 입력하세요>>");
			String email = scan.next();
			System.out.println("전화번호를 입력하세요>>");
			String p_num = scan.next();
			scan.nextLine();
			
			list.add(new User(useNo,id,pw,name,email,p_num));
			
			System.out.printf("아이디 : %s\n비밀번호 : %s\n이름: %s\n이메일 : %s\n전화번호 : %s\n",id,pw,name,email,p_num);
			System.out.println();
		
	}// user_input
		
	// 회원정보출력 부분 메소드	
	void use_output(ArrayList<User> list) {
		System.out.println("회원정보출력합니다. ");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		if(list.size()==0) {
			System.out.println("< 회원정보가 없습니다. >");
			System.out.println();
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			User u = (User) list.get(i);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s \n",
			u.getUseNo(),u.getId(),u.getPw(),u.getName(),u.getEmail(),u.getP_num());
			
		}
		System.out.println();
		
	}// user_output
	
//	// 회원정보수정 메소드
//	void use_update(ArrayList<User> list) {
//		int temp_no = user_subSearch(list);
//		
//		if(temp_no==1) {
//			System.out.println();
//			
//		}
//	}
}
