package com.schildt.prirucnik.git;

public class ZivotniVek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		for(x=0; x<3; x++) {
			int y= -1; //y se ponovo inicijalizuje kad god se udje u blok
			System.out.println("y je sada: "+ y); //ovo uvek prikazuje vrednost -1
			
			y=100;
			System.out.println("y je sada: " +y);
			
		}
	}

}
