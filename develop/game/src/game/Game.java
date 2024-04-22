package game;
import java.util.Scanner;


public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		menu st = new menu();

			int n;
			System.out.println("1:시작 2:종료");
			n=s.nextInt();
			if (n==1) {
				System.out.println("메뉴");
				System.out.println("-------------------");
				st.charter();

			}
			else if (n==2) {
				System.out.println("종료");
				System.exit(0);

			}
			else {
				System.out.println("잘못입력하셨습니다");
			}


//전투 페이지 에서 몬스터와 공격하는 방법 그리고 메뉴의 스테이터스를 받아와서 싸우고 메뉴로 스테이서스 값을 메뉴로 돌려 보내기 
//전투 페이지는 성공 실패로 나눠짐 
//성공 => 경험치 얻고 메뉴로 , 실패시 경험치 를 깍고 체력 100 지급


}
}
