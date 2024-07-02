package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user1 = new User();
		ArrayList<User> list = new ArrayList();
			System.out.println("ID를 입력하세요.>>");
			String id = scan.next();
//			System.out.printf("아이디 : %s \n",user1.id);
			System.out.println("PW를 입력하세요.>>");
			String pw = scan.next();
			System.out.println("이름을 입력하세요>>");
			String name = scan.next();
			list.add(new User(id,pw,name));
			System.out.printf("%s,%s,%s \n",id,pw,name);
//			System.out.printf("비밀번호  : %s \n ",user1.pw);
//			System.out.println();
//			
//			if(user1.id.equals(id) && user1.pw.equals(pw)) {
//				System.out.println("아이디,패스워드가 일치합니다.");
//				break;
//			}else {
//				System.out.println("아이디,패스워드가 일치하지않습니다.");
//			}
		
//	
//		
//		
//		user1.setName("홍길동");
//		System.out.println("이름 : "+user1.name); 
//		
//		user1.setGender("남자");
//		System.out.println("성별 : "+user1.gender); 
		
		
	
	}
	
		
}
