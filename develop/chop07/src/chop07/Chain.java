package chop07;


public class Chain {
	String firstNameString;
	String country;
	int age;
	
	public  Chain() {
		this("홀길순");
		
	}
	
	public Chain(String name) {
		this(name,20);
	}
	
	public Chain(String name , int age) {
		this(name,age,"대한민국");
	}
	
	public Chain(String name , int age , String mcounty) {
		firstNameString =name;
		country=mcounty;
		this.age=age;
	}
	
	void prinInfo() {
		System.out.println(firstNameString);
		System.out.println(country);
		System.out.println(age);
	}

}
