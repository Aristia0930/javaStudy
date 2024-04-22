package chap09;

public class Rectangle extends Shape{

	double length;
	double width;
	public Rectangle(String color,double length,double width) {
		super(color);
		System.out.println("rectangle 클래스 생성자 호출");
		this.length=length;
		this.width=width;
		
	}
	
	double area() {return length*width;}
	
	public String toString() {
		return "사각형 색상 " + super.getColor()+"면적" +area();
		
	}
	
	

}
