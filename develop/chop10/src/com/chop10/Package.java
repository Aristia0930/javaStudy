package com.chop10;
import java.util.Scanner;

import com.javamaster.mypackage.*;
public class Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat=new Cat();
		Cat myCat2=new Cat();
		
		String str1=myCat.eat();
		String str2=myCat.eat();
		myCat.scratch();
		myCat.meow();
		
		System.out.println(myCat.equals(myCat2)); //두 참조변수 주소가 다름
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		StringBuffer sb= new StringBuffer("hello");
		sb.append("g");
		System.out.println(sb);
		sb.insert(0, "javs");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		Scanner input =new Scanner(System.in);
		String str="";
		str=input.nextLine();
		String str3="";
		
		for(int i=str.length()-1; i>=0;i--) {
			str3=str3+str.charAt(i);
		}
		
		System.out.println(str3);
	}

}
