package SecondExercise;

abstract class Shape{
	String color="red";
	boolean filled=true;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	Shape(){}
	
	Shape(String c,boolean f){
		this.color=c;
		this.filled=f;
	}
	
	abstract double getArea();
	abstract double getPerimeter();	
}

class  Circle extends Shape{
	double radius=1.0;
	public Circle() {}
	public Circle(double r) {
		this.radius=r;
	}
	public Circle(double r,String color,boolean filled) {
		super();
		this.radius=r;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 3.142*radius*radius;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.142*radius;
	}
}

class Rectangle extends Shape{
	double width=1.0;
	double height=1.0;
	public Rectangle(){}
	public Rectangle(double w,double h) {
		this.width=w;
		this.height=h;
	}
	public Rectangle(double w,double h,String color,boolean filled) {
		super();
		this.width=w;
		this.height=h;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	
}

class Square extends Rectangle{
	double side;
	Square(){}
	Square(double side){
		this.side=side;
	}
	public Square(double s,String color,boolean filled) {
		super();
		this.side=s;
	}
	
	public void setWidth(double side) {
		this.side = side;
	}
	public void setHeight(double side) {
		this.side = side;
	}
	double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
}
public class OOPAbstract extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPAbstract ab=new OOPAbstract();
		
		System.out.println("Shape Information:");
		System.out.println("Color:"+ab.color+"\nFilled:"+ab.filled);
		System.out.println();
		
		Circle c=new Circle(1,"red",true);
		System.out.println("Circle Information:");
		System.out.println("Radius:"+c.radius+"\nColor:"+c.color+"\nFilled:"+c.filled+"\nArea:"+c.getArea()+"\nPerimeter:"+c.getPerimeter());
		System.out.println();
		
		Rectangle r=new Rectangle(10,15,"red",true);
		System.out.println("Rectangle Information:");
		System.out.println("Width:"+r.width+"\nheight:"+r.height+"\nColor:"+r.color+"\nFilled:"+r.filled+"\nArea:"+r.getArea()+"\nPerimeter:"+r.getPerimeter());
		System.out.println();
		
		Square sq=new Square(4,"red",true);
		System.out.println("Square Information:");
		System.out.println("Side:"+sq.side+"\nColor:"+sq.color+"\nFilled:"+sq.filled+"\nArea:"+sq.getArea()+"\nPerimeter:"+sq.getPerimeter());
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
