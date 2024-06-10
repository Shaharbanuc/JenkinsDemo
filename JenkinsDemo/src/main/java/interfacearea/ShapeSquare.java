package interfacearea;

public class ShapeSquare implements Shape{
	int b,a=10;

	public static void main(String[] args) {
		
		ShapeSquare obj=new ShapeSquare();
		obj.area();
		ShapeCircle objcircle=new ShapeCircle();
		objcircle.area();

	}

	@Override
	public void area() {
		b=a*a;
		System.out.println("the area of square is "+b);
		
	}

}
