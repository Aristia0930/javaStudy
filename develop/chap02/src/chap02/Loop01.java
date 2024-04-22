package chap02;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum=0;
		
		for(int i=0; i<5;i++) {
			int num = input.nextInt();
			sum+=num;
		}
		
		System.out.println(sum);
		
		int len=5;
		for(int i=0; i<len;i++) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int j =0; j<(2*len)-1-(i*2);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
