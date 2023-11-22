package IntermediateOOPAssignments;

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	void draw()
	{
		System.out.println("Drawing in a Line");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Drawing in a Rectangle");
	}
}
class Cube extends Shape{
	void draw()
	{
		System.out.println("Drawing in a Cube");
	}
}
public class DrawShapes {

	public static void drawShape(Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape line=new Line();
		Shape rectangle=new Rectangle();
		Shape cube=new Cube();
		
		drawShape(line);
		drawShape(rectangle);
		drawShape(cube);
		
		

	}

}
