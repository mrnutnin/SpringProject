package com;

public class Member {
    private String email;
    private String password;
    private String username;
	private String phone;
	private String permiss;
	

    public Member(String email, String password, String username, String phone, String permiss) {
        this.email = email;
        this.password = password;
        this.username = username;
		this.phone = phone;
		this.permiss = permiss;
	}
	public String getPermiss() {
		return permiss;
	}
	public void setPermiss(String permiss) {
		this.permiss = permiss;
	}

    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}