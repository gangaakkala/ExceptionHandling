package com.cuto.version2;

public class Circle {
	private double radius;
	private static final double PI=3.14;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void printPerimeter() throws RadiusException{
		if(radius<0) {
		
				throw new RadiusException("radius must not be negative");
			
			
		
		}
		else {
			double perimeter=2*PI*radius;
			System.out.println("Circle Perimeter is"+perimeter);
		}
	}
	public void printArea() throws RadiusException{
		if(radius<0) {
			
				
			
		
				throw new RadiusException("radius must not be negative");
			}
			
		
		else {
			double area=PI*radius*radius;
			System.out.println("area is circle is:"+area);
			
		}

}
}
