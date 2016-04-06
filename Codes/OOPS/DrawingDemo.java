class Shape{
	void draw(){
		System.out.println("Shape Draw Call");
	}
}
class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("Draw From Radius");
	}
}
class Rectangle extends Shape{
	@Override
	void draw(){
		System.out.println("Draw From L X B");
	}
}
class Square extends Shape{
	@Override
	void draw(){
		System.out.println("All Sides Equal");
	}
	void rhombous(){
		System.out.println("Diagnoal Equal...");
	}
	void rhombous2(){
		System.out.println("Diagnoal Equal...");
	}
}
class Drawing{
	// Polymorphic Method
	void drawShapes(Shape shape){
		shape.draw();
		if(shape instanceof Square){
		Square square = (Square)shape; //Downcast
		square.rhombous();
		square.rhombous2();
		}
	}
}
public class DrawingDemo {

	public static void main(String[] args) {
		new Drawing().drawShapes(new Square());
		//Drawing drawing = new Drawing();
		//Shape shape = new Square();//Upcasting
		//drawing.drawShapes(shape); 
		//drawing.drawShapes(new Square());
	}

}
