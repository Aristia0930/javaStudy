package chap08;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();
		myAnimal.sound();
		
		Animal mypig = new Pig();
		mypig.sound();

		
		Pig mypigs = new Pig();
		mypigs.sound();
		System.out.println(mypigs.a);
		
		Animal mydog = new Dog();
		mydog.sound();
	}

}
