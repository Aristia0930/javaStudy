package hasaa;

import chop07.Dog;

public class Protectest extends Dog{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Dog dog01=new Dog();
		
		dog01.breed="리트리버";
		dog01.color="갈색";

		
		System.out.println(dog01.breed);
		System.out.println(dog01.color);
//		dog01.bowwow();
		
		Protectest data=new Protectest();
		data.run(); // 클래스 상속해서 프로텍트로 지정된걸 사용가능
		//상속은 이렇게 해서 사용한다.
		data.breed="허스키";
		System.out.println(data.breed);
	}
	


	}


