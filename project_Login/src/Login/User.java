package Login;

import java.util.ArrayList;

public class User {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String p_num;
//	String name;
//	String gender;
	ArrayList list = new ArrayList();
	
	User(){};
	User(String id, String pw, String name,String email,String p_num) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.p_num = p_num;
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
		public void setP_num(String p_num) {
			this.p_num = p_num;
		}
		
		public String getP_num() {
			return p_num;
		}
		
		
		@Override
		public String toString() {
			return String.format("%s,%s,%s,%s,%s \n",id,pw,name,email,p_num);
		}
		


}
