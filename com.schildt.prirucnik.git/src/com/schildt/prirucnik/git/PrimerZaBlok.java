package com.schildt.prirucnik.git;

public class PrimerZaBlok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		y=20;
		
		//ova petlja izvrsava blok naredbi
		
		for( x=0; x<10; x++) {
			System.out.println("Ovo je x: " + x);			
			System.out.println("Ovo je y: " + y);
			y=y-2;
			
		}
	}

}
