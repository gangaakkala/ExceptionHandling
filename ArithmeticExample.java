package com.exception;
import java.util.*;
public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a:");
			int a=sc.nextInt();
			System.out.println("enter b:");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println("Division is"+c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("dont enter b value as zero");
		}
		catch(InputMismatchException e) {
			System.out.println("incorrect input");
		}
		
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
