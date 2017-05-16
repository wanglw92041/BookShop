package com.wlw.model;

public class Order {
	private int orderID;
	private String memberName;
	private String orderDate;
	private String wayDelivery;
	private String wayPay;
	private int moneyTotal;
	private int ifDelivery;
	private String note;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getWayDelivery() {
		return wayDelivery;
	}
	public void setWayDelivery(String wayDelivery) {
		this.wayDelivery = wayDelivery;
	}
	public String getWayPay() {
		return wayPay;
	}
	public void setWayPay(String wayPay) {
		this.wayPay = wayPay;
	}
	public int getMoneyTotal() {
		return moneyTotal;
	}
	public void setMoneyTotal(int moneyTotal) {
		this.moneyTotal = moneyTotal;
	}
	public int getIfDelivery() {
		return ifDelivery;
	}
	public void setIfDelivery(int ifDelivery) {
		this.ifDelivery = ifDelivery;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", memberName=" + memberName + ", orderDate=" + orderDate
				+ ", wayDelivery=" + wayDelivery + ", wayPay=" + wayPay + ", moneyTotal=" + moneyTotal + ", ifDelivery="
				+ ifDelivery + ", note=" + note + "]";
	}
	
}
