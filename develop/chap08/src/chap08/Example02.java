package chap08;

public class Example02{
//	public void as() {
//		System.out.println(super.age);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubKitten cat2 =new SubKitten ();
		
		SubKitten cat =new SubKitten ("아름이","다운이");


		System.out.println(cat.age);
		cat.printDetail();

	}

}
