package chop07;

public class AccessModifier01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog01=new Dog();
		
		dog01.breed="리트리버";
		dog01.color="갈색";
		dog01.age=15;
		
		System.out.println(dog01.breed);
		System.out.println(dog01.color);
		System.out.println(dog01.age);
		dog01.bowwow();
		dog01.run();
//		dog01.sleep(); //private이 접근불가
		dog01.getname("gpf");
		System.out.println(dog01.setname());

	}

}
