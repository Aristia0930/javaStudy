package chop07;

public class Add {
	
	Add(){
		System.out.println("add의 기본 생성자");
	}
	
	Add(int a,int b){
		System.out.println("int a int b 일반생성자 호출");
		System.out.println(a+b);
		int z=mi(a, b);
		System.out.println("-실행:"+z);
	}
	
	Add(double a, double b){
		System.out.println("double a double b 일반생성자 호출");
		System.out.println(a+b);
	}
	
	Add(int a, double b){
		System.out.println("int a double b 일반생성자 호출");
		System.out.println(a+b);
	}
	
	public static int mi(int a, int b) {
		return a-b;
	}

}
