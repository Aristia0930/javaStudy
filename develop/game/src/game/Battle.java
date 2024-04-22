package game;
import java.util.Scanner;

public class Battle {
	
	Scanner s = new Scanner(System.in);
	
	void Battle(menu st){
		while(true) {
		System.out.println("1:몬스터선택 2:메뉴");
		int n;
		n=s.nextInt();
		if (n==1) {
			System.out.println("-------------------");
			battlepage(st, 1);
			break;


		}
		else if (n==2) {
			System.out.println("메뉴");
			System.out.println("-------------------");
			st.menu();
			break;

		}
		else {
			System.out.println("잘못입력하셨습니다");
			System.out.println("");
		}
	}
	}
	
	void battlepage(menu st,int i) {//배틀 페이지/
		Monster m =new Monster();;
		m.goblin();
		System.out.println("몬스터 "+m.name+" 이 등장했다");
		while (0<m.hp) {
			System.out.println("1:공격 2:스킬 3:도망가기");
			System.out.println("-------------------");
			int n;
			n=s.nextInt();
			if (n==1) {
				
				m.hp=st.Attack(st.attack, m.attack, st.def,m.def,m.name , st.hp,m.hp);


			}
			else if (n==2) {

			}
			else if (n==3) {				
				System.out.println("도망갔다");
				System.out.println("-------------------");
				st.menu();
				break;

			}
			else {
				System.out.println("잘못입력하셨습니다");
				System.out.println("");
			}
		}
		System.out.println(m.name +"을 쓰러트렸다");
		System.out.println("-------------------");
		st.getexp(m.exp);
		st.menu();

		
		//선택지를 주어서 공격 스킬등 사용하여 전투하게 만듬
		
		
	}
	

	
}
