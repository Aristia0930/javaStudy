package problem;

public class Book {
	private int number;
	private String name;
	public Book(int number,String name){
		this.number =number;
		this.name=name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
		
	}
}
