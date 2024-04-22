package chap09;

public class Baby implements Papa,Mama{

	@Override
	public void mon() {
		System.out.println("엄마입니다");
		
	}

	@Override
	public void father() {
		System.out.println("아빠입니다");
		
	}
	
	public void printInfo() {
		System.out.println("나는 아기 입니다.");
	}
	
}
