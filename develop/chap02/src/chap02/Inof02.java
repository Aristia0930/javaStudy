package chap02;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Inof02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		
		if (x==y && x==z) {
			System.out.println("정수가 모두 같다");
		}
		
		else if (x>=y) {
			if (x>z) {
				System.out.println("x가 가장크다");
			}
			else if (x==z) {
				System.out.println("x와 z가 같다");
			}
			
			else if (x==y) {
				System.out.println("x와 y가 같다");
			}
			else{
				System.out.println("z가 가장크다");
				
			}
		}
		else if (y>=x) {
			if (y>z) {
				System.out.println("y가 가장크다");
			}
			else if (y==z) {
				System.out.println("y와 z가 같다");
			}
			
			else{
				System.out.println("z가 가장크다");
				
			}
		}
		
		else if (z>=x) {
			if (z>y) {
				System.out.println("z가 가장크다");
			}
			else if (y==z) {
				System.out.println("y와 z가 같다");
			}
			

			else{
				System.out.println("y가 가장크다");
				
			}
		}
		
		else {
			System.out.println("?>");
		}
		

	}

}
