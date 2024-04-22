package game;
import java.util.Scanner;

public class menu {
	Scanner s = new Scanner(System.in);
	int maxHp;		//최대체력
	int maxMp;		//최대마나
	int hp=maxHp;			//체력
	int mp=maxMp;			//마나
	int attack;		//공격력
	int def;		//방어력
	int level;		//레벨
	int exp;		//경험치
	String[] items = new String[10];
		

	
	public void menu() {

		int n;
		System.out.println("1.전투 2.현재상태 3.종료");
		n=s.nextInt();
		if (n==1) {
			System.out.println("전투");
			System.out.println("");
			Battle battle = new Battle();
			battle.Battle(this);
			
		}
		else if (n==2) {
			System.out.println("현재상태");
			System.out.println("-------------------");
			state();
		}
		else if (n==3) {
			System.out.println("종료");
			System.exit(0);
		}
		else {
			System.out.println("잘못입력하셨습니다");
			System.out.println("");
			menu();
		}
		
	}
	
	void charter() {
		exp=0;
		maxHp=100;
		maxMp=0;
		mp=maxMp;
		hp=maxHp;
		attack=2;
		def=1;
		level=1;
		menu();
	}
	void state() {
		System.out.println("hp/mxahp : "+hp+"/"+maxHp);
		System.out.println("mp/maxmp : "+mp+"/"+maxMp);
		System.out.println("attack : "+attack);
		System.out.println("def : "+def);
		System.out.println("leve : "+level);
		System.out.println("exp : "+exp+"\n");
		System.out.print("아이템: ");
		for (int i = 0; i < items.length; i++) {
		    System.out.print(items[i] + " ");
		}
		System.out.println();
		menu();
		
		
		
	}
	
	void getexp(int exp) {
		this.exp+=exp;
		if (exp>=100) {
			level+=1;
			this.exp=0;
			maxHp+=10;
			maxMp+=1;
			mp=maxMp;
			hp=maxHp;
			attack+=2;
			def+=1;
			System.out.println("LEVEL UP");		
			System.out.println("-------------------");
			
		}
	}
	
    
	 int Attack(int myattack, int monattack, int mydef,int mondef,String name , int myhp,int monhp) {
		// TODO Auto-generated constructor stub
		
		int mydamage=myattack-mondef;
		System.out.println(name+" 한테 공격");
		if (mydamage<0) {
			mydamage=0;
		}
		System.out.println(mydamage+ "의 데미지가 들어갔다");
		monhp-=(mydamage);
		if (monhp>0) {
		System.out.println(name+" 의 남은 hp는" +monhp);
		System.out.println();
		
		int mondamage=monattack-mydef;
		
		if (mondamage<0) {
			mondamage=0;
		}
		System.out.println(name+" 이" + mondamage+ "으로 공격하였다");
		myhp-=mondamage;
		if (myhp>0) {
		System.out.println("나의 남은 hp는 " +myhp);
		System.out.println("-------------------");
		hp=myhp;
		}
		 else {
			System.out.println("패배하였습니다");
			System.out.println("-------------------");
			exp-=30;
			hp=50;
			menu();
		}
		}
		
		
		return monhp ;
	}
	
	

}
