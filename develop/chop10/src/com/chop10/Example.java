package com.chop10;

import java.util.Arrays;
import java.util.Random;


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random1=new Random();
		int[] array=new int[6];
		int count=0;
		while(count<6) {
			int a=random1.nextInt(1,45);
			if (Arrays.asList(array).contains(a)) {
				continue;
				
			}
			else {
				array[count++]=a;
				System.out.print(a);
				System.out.print(" ");
			}
		}

	}

}
