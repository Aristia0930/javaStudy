package chap13;

import java.util.ArrayList;
import java.util.List;

public class Example00 {
	public String name(String n) {
		return n+"!!";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array =new ArrayList<Integer>();
		array.add(1);
		System.out.println(array.get(0));
		for(int i=10; i>=1;i--) {
			array.add(i);
		}
		
		ArrayList<String> myName=new ArrayList<String>();
		Example00 hi=new Example00();
		myName.add(hi.name("g"));
		System.out.println(myName.get(0));
	
		System.out.println(myName.isEmpty());
		myName.add(0,"rla");
		System.out.println(myName.contains("g!!"));
		myName.set(1,"샴");
		for(String str:myName) {
			System.out.println(str);
		}
		array.sort((a,b)-> b-a);
		for(int sr:array) {
			System.out.println(sr);
		}
		
		System.out.println(array);
		

	}

}
