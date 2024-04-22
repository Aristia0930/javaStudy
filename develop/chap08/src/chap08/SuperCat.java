package chap08;

public class SuperCat {
	String name;
	
	String bree = "고양이";
	String age ="15살";
	
	SuperCat(){

		System.out.println("부모고양이입니다 ");
	}
	
	SuperCat(String n){
		name=n;
		System.out.println("부모고양이입니다 "+name);
	}
	void printInfo() {
		System.out.println("부모고양이 입니다.");
	}

}
