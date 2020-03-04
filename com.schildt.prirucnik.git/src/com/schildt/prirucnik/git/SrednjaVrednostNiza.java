package com.schildt.prirucnik.git;

public class SrednjaVrednostNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double brojevi[]= {10.1,11.2,12.3,13.4,14.5};
		double rezultat= 0;
		int i;
		
		for(i= 0; i<5; i++)
			rezultat= rezultat+ brojevi[i];
		System.out.println("Srednja vrednost niza je "+ rezultat/5);
		
}
}