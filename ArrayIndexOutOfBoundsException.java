package com.exception;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		try {
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
