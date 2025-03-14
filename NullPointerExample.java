package com.exception;

public class NullPointerExample {
	public static void getFullName(String fname,String lname) {
		try {
			fname=fname.toUpperCase();
			lname=lname.toUpperCase();
			String fullname=fname+" "+lname;
			System.out.println(fullname);
		}
		catch(NullPointerException e) {
			System.out.println("null value not accepted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFullName("ganga","parvathi");
		getFullName("geetha",null);
		getFullName(null,"lasya");
		getFullName(null,null);
		

	}

}
