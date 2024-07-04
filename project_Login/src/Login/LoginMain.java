package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User u = new User();
		ArrayList<User> list = new ArrayList();
		int choice = 0;
		String useNo="", id="", pw="",name="",email="",p_num="";
		list.add(new User(useNo,id,pw,name,email,p_num));
	loop1: while (true) {
//			choice = u.screen(list);
//				
//			switch(choice) {
//			case 1: // 회원정보입력
//				u.use_input(list);
//				break;
//			case 2: // 회원정보출력
//				u.use_output(list);
//				break;
//			case 3: // 회원정보수정 출력
//				u.use_update(list);
//				break;
//			case 0: // 프로그램종료
//				System.out.println("프로그램을 종료합니다.");
//				break loop1;
////				
//	}// switch
			
} // while
			
		
//			if(u.id.equals(id) && u.pw.equals(pw)) {
//				System.out.println("아이디,패스워드가 일치합니다.");
//				break;
//			}else {
//				System.out.println("아이디,패스워드가 일치하지않습니다.");
//			}
		
	
} // main
	
		
}// class
