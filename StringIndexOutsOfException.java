package com.exception;

public class StringIndexOutsOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ganga Parvathi";
		try {
		for(int i=0;i<=s.length();i++) {
			System.out.println(s.charAt(i));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
