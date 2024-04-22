package chap02;
import java.util.Scanner;
public class Inof01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		
		if (num%2==0) {
			System.out.println(num+"짝수입니다");
		}
		else if (num==5) {
			System.out.println("5입니다");
		}
		else {
			System.out.println(num+"홀수입니다.");
		}
		
		

	}

}
