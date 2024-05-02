package com.mkpits.login;

public class Registration_Model {

	
	public String name;
	public String email;
	public String gender;
	public String city;
	public long mobile;
	public String password;
	public String cnfmpassword;
	
	public Registration_Model(String name, String email, String gender, String city, long mobile, String password,
			String cnfmpassword) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
		this.password = password;
		this.cnfmpassword = cnfmpassword;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public long getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}

	public String getCnfmpassword() {
		return cnfmpassword;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCnfmpassword(String cnfmpassword) {
		this.cnfmpassword = cnfmpassword;
	}

	@Override
	public String toString() {
		return "Registration_Model [name=" + name + ", email=" + email + ", gender=" + gender + ", city=" + city
				+ ", mobile=" + mobile + ", password=" + password + ", cnfmpassword=" + cnfmpassword + "]";
	}
}

