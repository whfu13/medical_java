package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Login_Main {
	
	public static void main(String[] args) {
		User_process u = new User_process();
		ArrayList<User_Data> list = new ArrayList<User_Data>();
		String useNo="", id="", pw="",name="",email="",p_num="";
		int choice = 0;
		
		
		loop1: while (true) {
			choice = u.screen(list);
				
			switch(choice) {
			case 1: // 회원정보입력
				u.use_input(list);
				break;
				
			case 2: // 회원정보출력
				u.use_output(list);
				break;
				
			case 0: // 프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
//				
	}// switch
			
} // while
			
		
	
} // main
	
		
}// class
