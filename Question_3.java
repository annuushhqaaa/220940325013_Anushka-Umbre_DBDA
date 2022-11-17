class Shape
{
	void draw()
	{
		System.out.println("Drawing the shape");
	}
	void erase()
	{
		System.out.println("Erasing the shape");
	}
	
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing the Circle");
	}
	void erase()
	{
		System.out.println("Erasing the Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing the Triangle");
	}
	void erase()
	{
		System.out.println("Erasing the Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing the Square");
	}
	void erase()
	{
		System.out.println("Erasing the Square");
	}
}
class Question_3
{
	public static void main(String args[])
	{
		Shape c= new Circle();
		Shape t= new Triangle();
		Shape sq=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		sq.draw();
		sq.erase();
	}
}
		
	
		