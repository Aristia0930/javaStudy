package com.chop10;

import java.util.Calendar;

public class Calendarc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar obj1=Calendar.getInstance();
		Calendar obj3=Calendar.getInstance();
		Calendar obj2=Calendar.getInstance();

		
		obj2.add(Calendar.YEAR, 10);
		System.out.println(obj2.getTime());
		System.out.println(obj1.getTime());
		System.out.println(obj1.compareTo(obj2));


	}

}
