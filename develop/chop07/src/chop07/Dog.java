package chop07;

public class Dog {
	public String breed;
	public String color;
	protected int age;
	private String name;
	
	void bowwow() {
		System.out.println("멍멍 짖다");
	}
	
	protected void run() {
		System.out.println("달리다");
	}
	
	private void sleep() {
		System.out.println("잠을잔다");
		
	}
	protected int protectedVariable;
	
	public void getname(String named) {
		name=named;
		
	}
	
	public String setname() {
		return name;
		
	}


}
