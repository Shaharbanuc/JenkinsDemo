package interfacearea;

public class ShapeCircle implements Shape{
	
	float a,r=8.00f;

	@Override
	public void area() {
		a=r*r*3.14f;
		System.out.println("the area of circle is "+a);
		
	}
	

}
