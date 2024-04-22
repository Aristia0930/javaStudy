package com.market.cart;
import com.market.bookitem.Book;

public class CarItem {
	
//	private String[] itemBook=new String[7];
	private Book itemBook;
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	public CarItem() {
		
	}
	
	public CarItem(Book booklist) {
		this.itemBook=booklist;
		this.bookID=booklist.getBookId();
		this.quantity=1;
		updateTotalPrice();
		
	}

	public Book getItemBook() {
		return itemBook;
	}

	public void setItemBook(Book itemBook) {
		this.itemBook = itemBook;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice=totalPrice;
	}

	public void updateTotalPrice() {
		totalPrice = this.itemBook.getUnitPrice()*this.quantity;
		
		//Integer.parseInt 문자열을 숫자로 변경 
	}
	
	

}