package chap08;

public class CalculationTest extends Calculation{
	
	public void multiplication(int x,int y) {
		z=x*y;
		System.out.println("두수의 곱셈은 : "+z);
	}
	
	//메서드 오버라이딩
	public void addition(int x, int y) {
		z=x+y+100;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=20,b=10;
		CalculationTest ca = new CalculationTest();
		ca.addition(a, b);
		ca.subtraction(a, b);
		ca.multiplication(a, b);
		

	}

}
