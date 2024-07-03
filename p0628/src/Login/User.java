package Login;

import java.util.ArrayList;

public class User {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String p_number;
//	String name;
//	String gender;
	ArrayList list = new ArrayList();
	
	User(){};
	User(String id, String pw, String name,String email,String p_number) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.p_number = p_number;
//		setId(id);
//		setPw(pw);
//		setName(name);
		}
	
		public void setId(String id) {
			this.id = id;
		}
		
		public String getId() {
			return id;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}	
		
		public String getPw() {
			return pw;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getEmail() {
			return email;
		}
		public void setP_number(String p_number) {
			this.p_number = p_number;
		}
		
		public String getP_number() {
			return p_number;
		}
		
		
//		public boolean equals(Object o) {
//			if(o == null || !(o instanceof User)) {
//				return false;
//			}
//			
//			User temp = (User) o;
//			
//			return id.equals(temp.getId());
//		}
		
		@Override
		public String toString() {
			return String.format("%s,%s,%s,%s,%s \n",id,pw,name,email,p_number);
		}
		


}
