package chop07;

public class Object01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st01=new Student();
		st01.name="홀길동";
		st01.id=20240408;
		
		st01.printInfo();
		
		Student st02=new Student();
		st02.insertRecord(20240503, "미야");
		st02.printInfo();
		
		//일반생성자 사용법
		Student st03=new Student(123213,"아리");
		st03.printInfo();
		//일반생성자 오버로딩
		Student st04=new Student(1232);
		st04.printInfo();
	}

}
