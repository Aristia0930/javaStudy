package chap09;

public class AbstractClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1= new Circle("빨간색", 2.2);//부모의 내용꺼만 사용할경우
		Shape s2 =new Rectangle("노란색", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
