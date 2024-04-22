package com.market.cart;
import java.util.ArrayList;

import com.market.bookitem.Book;



public class Cart implements CartInterface{
	public ArrayList<CarItem> mCartItem = new ArrayList<CarItem>();
	public static int mCartCount =0;
	
	public Cart() {
		
	}

	@Override
	public void printBookList(ArrayList<Book> booklist) {
		// TODO Auto-generated method stub
		for(int i=0; i<booklist.size();i++) {
			Book bookitem =booklist.get(i);
			System.out.print(bookitem.getBookId());
			System.out.print("|"+bookitem.getName());
			System.out.print("|"+bookitem.getAuthor());
			System.out.print("|"+bookitem.getDescription());
			System.out.print("|"+bookitem.getCategory());
			System.out.print("|"+bookitem.getReleaseDate());
			System.out.println("");
		}
		
	}

	@Override
	public boolean isCartInBook(String bookId) {
		// TODO Auto-generated method stub
		boolean flage = false;
		for(int i =0; i<mCartItem.size();i++) {
			if(bookId==mCartItem.get(i).getBookID()) {
				mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity()+1);
				flage=true;
			}
		}
		return false;
	}

	@Override
	public void insertBook(Book book) {
		// TODO Auto-generated method stub
		CarItem bookitem =new CarItem(book);
		mCartItem.add(bookitem);
		mCartCount=mCartItem.size();
		
	}
	
	

	@Override
	public void removeCart(int numId) {
		// TODO Auto-generated method stub
		mCartItem.remove(numId);
		mCartCount=mCartItem.size();
	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		mCartItem.clear();
		mCartCount=0;
		
	}
	
	public void printCart() {
		int sum=0;
		System.out.println("장바구니 상품 목록 보기:");
		System.out.println("------------------------------------");
		System.out.println("     도서ID \t| 수량\t| 합계");
		for(int i=0; i<mCartItem.size();i++) {
			System.out.print(mCartItem.get(i).getBookID()+"\t|");
			System.out.print(mCartItem.get(i).getQuantity()+"\t|");
			System.out.print(mCartItem.get(i).getTotalPrice());
			System.out.println("");
			sum+=mCartItem.get(i).getTotalPrice();
			
		}
		System.out.println("--------------------------------");
		System.out.println("총합 :" +sum);
	}
	
	
	
	

}
