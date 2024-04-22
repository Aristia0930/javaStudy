package chop07;

public class Student {
	int id;
	String name;
	Student(){
		System.out.println("student 생성자");
	}
	
	Student(int parm1){
		
		System.out.println("student().. 오버로딩일반생성자");
		id=parm1;

		
	}
	
	Student(int parm1,String parm2){
		
		System.out.println("student().. 일반생성자");
		id=parm1;
		name=parm2;
		
	}
	

	
	void insertRecord(int parm1,String parm2) {
		id=parm1;
		name=parm2;
	}
	
	void printInfo() {
		System.out.println("아이디 :" +id);
		System.out.println("이름 :" +name);
	}

}
