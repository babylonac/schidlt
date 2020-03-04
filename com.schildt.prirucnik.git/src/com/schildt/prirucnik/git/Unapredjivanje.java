package com.schildt.prirucnik.git;

public class Unapredjivanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=42;
		char c= 'a';
		short s= 1024;
		int i = 50000;
		float f = 5.67f;
		double d= .1234;
		double rezultat= (f*b)+(i/c)-(d*s);
		System.out.println((f*b)+" + "+(i/c)+" - "+(d*s));
		System.out.println("rezultat= "+ rezultat);
	}

}
