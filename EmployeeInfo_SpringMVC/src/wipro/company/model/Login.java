package wipro.company.model;

public class Login
{
	private String uname;
	private String pw;
	private String msg;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pw=" + pw + ", msg=" + msg + "]";
	}
	
	

}
