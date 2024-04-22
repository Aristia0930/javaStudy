package chap02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int value=input.nextInt();
		
		switch (value/10) {
		case 10: {
			System.out.println("만점");
			break;
		}
		case 9:
		case 8:{
			System.out.println("a학점");
			break;
		}
		
		case 7:
		case 6:
		case 5:{
			System.out.println("b학점");
			break;
		}
		
		case 4:
		case 3:
		case 2:
		case 1:{
			System.out.println("c학점");
			break;
		}
		
		default:
			System.out.println("f학점");



	}}

}
