package CoreJava.oops;
abstract class Shape {
abstract void draw();
}

class Line extends Shape{
	void draw() {
		System.out.println("drawing Line");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing Rectangle");
	}
}

class Cube extends Shape{
	void draw() {
		System.out.println("drawing Cube");
	}
}


public class oopQ5 {
	public static void main(String args[]){
		Line l=new Line();
		l.draw();
		Cube c=new Cube();
		c.draw();
		Rectangle r=new Rectangle();
		r.draw();

	}

}