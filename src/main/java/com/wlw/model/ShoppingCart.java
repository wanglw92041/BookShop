package com.wlw.model;

public class ShoppingCart {
	private String shoppingCartID;
	private String memberName;
	private int bookID;
	private int count;

	public String getShoppingCartID() {
		return shoppingCartID;
	}

	public void setShoppingCartID(String shoppingCartID) {
		this.shoppingCartID = shoppingCartID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartID=" + shoppingCartID + ", memberName=" + memberName + ", bookID=" + bookID
				+ "]";
	}

}
