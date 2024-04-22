package chap08;

public class SubKitten extends SuperCat{
	String age ="2살";
	
	String name ;
	SubKitten(){
		super();
		
		System.out.println("일반생성자");
	}
	SubKitten(String n1, String n2) {
		super(n1); //부모 생성자 호출
		this.name=n2;
		System.out.println("아기고양이 이름은" +name);
	}
	
	void printInfo() {
		System.out.println("아기고양이 입니다");
	}
	
	void printDetail() {

		String age="4살";
		super.printInfo();
		System.out.println(super.bree +" "+super.age);
		printInfo();
		System.out.println(this.bree +" "+age);
		
	}

}
