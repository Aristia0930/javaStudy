package com.market.bookitem;

public abstract class Item {
	String booId;
	String name;
	int unitPrice;
	
	public Item (String booId,String name,int unitPrice) {
		this.booId=booId;
		this.name=name;
		this.unitPrice=unitPrice;
		
	}
	
	abstract String getBookId();
	abstract String getName();
	abstract int getUnitPrice();
	
	abstract void setBookId(String booId);
	abstract void setName(String name);
	abstract void setUnitPrice(int unitPrice);
	

}
