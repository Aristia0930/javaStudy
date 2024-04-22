package chap06;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myArr;
		myArr=new String[3];
		Scanner input =new Scanner(System.in);
		
		for(int i=0 ; i<3;i++) {
			myArr[i]=input.nextLine();
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(myArr[i]);
		}

	}

}
