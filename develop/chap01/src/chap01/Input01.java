package chap01;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int i =input.nextInt();
		int k =input.nextInt();
		input.nextLine(); //
		
		System.out.println(i);
		System.out.println(k);
		System.out.println("문자열을 입력하세요");
		String str=input.nextLine();
		System.out.println(str);
		
		System.out.println("입력하세요");
		int[] array =new int[4];
		for (int ia=0;ia<array.length;ia++) {
			int j=input.nextInt();
			array[ia]=j;
		}

        System.out.println("입력된 배열:");
        for (int element : array) {
            System.out.println(element);
        }

	}

}
