package chap09;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle 클래스 생성자 호출");
		this.radius=radius;
	}

	

	@Override
	double area() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원색상은 " + super.getColor()+"면적" +area();
	}
	

}
