package com.schildt.prirucnik.git;

public class EkspKonverzija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b;
		int i= 257;
		double d = 323.142;
		
		System.out.println("\nKonverzija tipa int u tip byte.");
		b= (byte) i;
		System.out.println("i i b "+i + " " +b);
		
		System.out.println("\nKonverzija tipa double u tip int");
		i=(int) d;
		System.out.println("d i i "+d+" "+i);
		
		System.out.println("\nKonverzija tipa double u tip byte." );
		b= (byte) d;
		System.out.println("d i b "+ d+" "+b);
	}

}
