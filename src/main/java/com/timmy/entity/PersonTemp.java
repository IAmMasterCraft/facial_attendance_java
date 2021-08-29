package com.timmy.entity;

public class PersonTemp {
	private int userId;
	private String name;
	private int privilege;
	private String imagePath;
	private String password;
	private String cardNum;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	@Override
	public String toString() {
		return "PersonTemp [userId=" + userId + ", name=" + name + ", privilege=" + privilege + ", imagePath="
				+ imagePath + ", password=" + password + ", cardNum=" + cardNum + "]";
	}

	
}
