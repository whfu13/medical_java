package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class User_process2 {
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
		System.out.println("3. 회원정보수정");
		System.out.println("4. 계정 삭제");
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
			
			list.add(new User_Data(useNo,id,pw,name,email,p_num));
			
			// 아이디,패스워드 일치 확인
			if(id.equals(id) && pw.equals(pw)) {
			System.out.println("아이디,패스워드가 일치합니다.");	
			}else {
			System.out.println("아이디,패스워드가 일치하지않습니다.");
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
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s \n",
			u.getUseNo(),u.getId(),u.getPw(),u.getName(),u.getEmail(),u.getP_num());
			
		}
		System.out.println();
		
	}// user_output
	
	// 회원정보수정 메소드
	void use_update(ArrayList<User_Data> list) {
		int temp_no = use_subSearch(list);
		
		if(temp_no==1) {
			System.out.println("찾는 계정이 없습니다. 다시 입력하세요.");
			System.out.println();
		}
		
		User_Data u = (User_Data) list.get(temp_no);
		
		// 계정검색 후 진행
				System.out.printf("          [ %s 내 정보관리 ] \n",u.getName());
				System.out.println("---------------------------------");
				System.out.println("1.아이디 변경");
				System.out.println("2.비밀번호 변경");
				System.out.println("3.휴대폰 번호 변경");
				System.out.println("-----------------------");
				System.out.println("원하는 번호를 입력하세요.>> ");
				choice = scan.nextInt();
				
				switch(choice) {
				
//				case 1: // 아이디 변경
//					log_update(u,u.getId(),choice);
//					break;
//				case 2: // 비밀번호 변경
//					log_update(u,u.getPw(),choice);
//					break;
//				case 3: // 휴대폰 번호 변경
//					log_update(u,u.getP_num(),choice);
//					break;
					
				}//switch
	}// use_update
	
		// 계정 삭제 메소드
	void use_delete(ArrayList<User_Data> list) {
		
		int temp_no = use_subSearch(list);
		
		// 찾은 계정 삭제
		if(temp_no==1) {
			System.out.println("찾는 계정이 없습니다. 다시 입력하세요.");
			System.out.println();
			return;
		}
		
		User_Data u = (User_Data) list.get(temp_no);
		
		System.out.printf("%s 계정을 삭제하시겠습니까?(1.삭제 0.취소) \n",u.getName());
		choice = scan.nextInt();
		
		if(choice==0) {
			System.out.println("삭제가 취소되었습니다.");
			System.out.println();
			return;
		}else {
			System.out.printf("%s 계정을 삭제했습니다. \n",u.getName());
			System.out.println();
			list.remove(temp_no);
		}
		
	}// use_delete
	
	// 수정,삭제에서 검색부분 메소드
	int use_subSearch(ArrayList<User_Data>list) {
		System.out.println("[ 회원검색 ]");	
		System.out.println("찾는 회원이름을 입력하세요.>>");
		String search = scan.nextLine();
		
		// 검색
		int temp_no = -1;
		for(int i=0;i<list.size();i++) {
		User_Data u = (User_Data) list.get(i);
			if(u.getName().equals(search)) {
				temp_no = i;
				System.out.printf("%s 이름이 검색되었습니다 \n",search);
				System.out.println();
				break;
			}
		}
		return temp_no;
		
		
		
		
	}
	
	
} // class
