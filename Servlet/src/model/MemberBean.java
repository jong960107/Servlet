package model;

public class MemberBean {

	//MVC2에서는 MVC1과는 달리 useBean 사용이 불가하다.
	//그렇다면 서블릿에서 빈클래스를 담아야 하는데 그 방법은 MemberJoinProc2.java에서 확인하자.
	
	private String id;
	private String password;
	private String email;
	private String tel;
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
