package com.cuto.version2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1=new Circle(1.23);
		try {
		obj1.printArea();
		obj1.printPerimeter();
		}
		catch(RadiusException e) {
			e.getMessage();
		}
		Circle obj2=new Circle(-1.23);
		try {
		obj2.printArea();
		obj2.printPerimeter();
		}
		catch(RadiusException e) {
			e.getMessage();
		}
	}

}
