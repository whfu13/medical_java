package Login;

import java.util.ArrayList;

public class User {
	String id,pw,name,gender;
//	String name;
//	String gender;
	ArrayList list = new ArrayList();
	
	User(){};
	User(String id, String pw, String name, String gender) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
//		setId(id);
//		setPw(pw);
//		setName(name);
//		setGender(gender);
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
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public String getGender() {
			return gender;
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
			return String.format("%s,%s,%s,%s \n",id,pw,name,gender);
		}
		


}
