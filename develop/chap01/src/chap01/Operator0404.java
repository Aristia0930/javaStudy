package chap01;

public class Operator0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=1.1;
		int x=10 , y=12;
		System.out.println(x+y);
		System.out.println(x+d);
		System.out.println(x==10);
		System.out.println(x==y);
		System.out.println(!(x==y)&&(x==10));
		System.out.println(x-=y);
		
		int a=4,b=4,c=7;
		System.out.println(c=a++);
		System.out.println(a);
		System.out.println(++b );
		System.out.println("형변환" );
		System.out.println(x/d);
		System.out.println(x/(int)d);
		
		

	}

}



