package com.wlw.model;

public class Book {
	private int bookID;
	private int typeID;
	private String bookName;
	private float price;
	private String author;
	private String information;
	private String content;
	private String image;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", typeID=" + typeID + ", bookName=" + bookName + ", price=" + price
				+ ", author=" + author + ", information=" + information + ", content=" + content + ", image=" + image
				+ "]";
	}

}
