package chap05;

public class Method02 {
	
	public static int max(int x,int y) {
		int result;
		if(x>y) {
			result=x;
			System.out.println("a가 더큰수이다");
		}
		
		else 
			result=y;
			System.out.println("b가 더큰수이다");
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5, b=6;
		int num=max(a, b);
		System.out.println(num);

	}

}
