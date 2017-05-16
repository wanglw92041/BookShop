package com.wlw.model;

import java.sql.Date;

public class Member {
	private String memberName;
	private String password;
	private String name;
	private String sex;
	private Date birthDate;
	private String address;
	private String telephone;
	private String mobilephone;
	private String postalcode;
	private String IDnum;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getIDnum() {
		return IDnum;
	}

	public void setIDnum(String iDnum) {
		IDnum = iDnum;
	}

	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", password=" + password + ", name=" + name + ", sex=" + sex
				+ ", birthDate=" + birthDate + ", address=" + address + ", telephone=" + telephone + ", mobilephone="
				+ mobilephone + ", postalcode=" + postalcode + ", IDnum=" + IDnum + "]";
	}

}
