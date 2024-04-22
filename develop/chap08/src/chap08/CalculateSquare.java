package chap08;

class Square {
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	
	public int square(int a,int b) {
		return a*b;
	}
	
	public double square(double a,double b) {
		return a*b;
	}
	
	public double square(int a,double b) {
		return a*b;
	}

}

public class CalculateSquare {
	public static void main(String[] args) {
		
		Square myarea =new Square();
		System.out.println(myarea.square(10, 5));
		System.out.println(myarea.square(10.5, 5));
		
	}


}
