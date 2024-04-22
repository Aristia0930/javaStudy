package problem;

import java.util.*;



public class Ex2 {

	public static void main(String[] args){
		

		ArrayList<Integer> list = new ArrayList<Integer>(); 
		int count=0;
		for(int i=0;i<100;i++) {
			
			String numString =String.valueOf(i);
			int count2=0;
			for (int j=i;j<100;j++) {
				char a=numString.charAt(j);
				if(a=='5' || a=='0') {
					count2+=1;
				}
				
			}

			
		}

		System.out.println(list);
		
	}

}