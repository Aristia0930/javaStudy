package chap05;

public class Mehod01 {
	
	public static void method() {
		System.out.println("static메서드입니다");
		System.out.println(5+6);
		
	}
	
	public static String greeting() {
		System.out.println("string 타입의 메서드이다");
		return "hi";
	}
	
	//매개변수가 있는 메서드
	public static int div(int a,int b) {
		int result=a/b;
		return result;
	}
	
	public int divv(int a,int b) {
		int result=a/b;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메서드 호출");
		method();
		
		String str=greeting(); //메서드 결과를 집어넣는다 return 값으 반환하기에
		System.out.println(str + " java");
		
		int ans=div(10,2);
		System.out.println(ans);
		
		//static 선언 안한경우에는
		Mehod01 myclass = new Mehod01(); //클래스로부터 객체 생성
		int answer = myclass.divv(15,5); //메소드 사용 
		System.out.println(answer);
		
		
	}

}
