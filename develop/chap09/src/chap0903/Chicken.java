package chap0903;

public class Chicken implements Fly,Walk {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("닭은 날 수 있다.");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("닭은 걸을 수있다.");
		
	}
	
	

}
