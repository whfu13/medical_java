package Login;

public class User_Data {
	
	private String useNo;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String p_num;
	static int count = 1;
	
	
	
	public User_Data(){};
	
	public User_Data(String id, String pw, String name, String email,String p_num) {
		this.useNo = String.format("U%03d",count++);
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.p_num = p_num;
	}
	
	public User_Data(String useNo, String id, String pw, String name,String email,String p_num) {
		this.useNo = useNo;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.p_num = p_num;

		}
	
		public String getUseNo() {
			return useNo;
		}
		public void setUseNo(String useNo) {
			this.useNo = useNo;
		}
	
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		public String getP_num() {
			return p_num;
		}
		public void setP_num(String p_num) {
			this.p_num = p_num;
		}
		
		
}
