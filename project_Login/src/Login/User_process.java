package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class User_process {
	Scanner scan = new Scanner(System.in);
	String[] title = {"번호","아이디","비밀번호","이름","이메일","전화번호"};
	String useNo,id,pw,name,email,p_num;
	int choice ;
	
	// 로그인창 화면 메소드
	int screen(ArrayList<User_Data> list) {
		System.out.println("[ 회원가입 ]");
		System.out.println("-----------------------------------");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
//		System.out.println("3. 회원정보수정");
//		System.out.println("4. 계정 삭제");
//		System.out.println("5. 비밀번호변경");
//		System.out.println("6. 회원정보저장");
		System.out.println("0. 회원가입종료");
		System.out.println("------------------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	}// screen
	
	// 회원정보입력 부분 메소드
	void use_input(ArrayList<User_Data> list) {
		while(true) {
			System.out.println("회원가입을 시작합니다!");
			System.out.println("아이디를 입력하세요>>(0.이전페이지 이동)");
			id = scan.nextLine();
			
			if(id.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}
			
			// 아이디 중복체크
			for(int i=0;i<list.size();i++) {
				if(id.equals(list.get(i).getId())) {
					System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 입력하세요.");
					break;
				}
		}
			System.out.println("패스워드를 입력하세요.>>");
			pw = scan.next();
			System.out.println("이름을 입력하세요>>");
			name = scan.next();
			System.out.println("이메일을 입력하세요>>");
			email = scan.next();
			System.out.println("전화번호를 입력하세요>>");
			p_num = scan.next();
			scan.nextLine();
			
			list.add(new User_Data(id,pw,name,email,p_num));
			
			// 아이디,패스워드 일치 확인
			for(int i=0; i<list.size(); i++) {
				User_Data u = (User_Data) list.get(i);
				if(u.getId().equals(id) && u.getPw().equals(pw)) {
					System.out.println("아이디,패스워드가 일치합니다.");	
				}else {
				System.out.println("아이디,패스워드가 일치하지않습니다.");
				}
			}
			
		}// while
	}// user_input
		
	// 회원정보출력 부분 메소드	
	void use_output(ArrayList<User_Data> list) {
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
			User_Data u = (User_Data) list.get(i);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t \n",
			u.getUseNo(),u.getId(),u.getPw(),u.getName(),u.getEmail(),u.getP_num());
			
		}
		System.out.println();
		
	}// user_output
	
	
} // class
