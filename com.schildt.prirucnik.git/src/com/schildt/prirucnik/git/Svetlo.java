package com.schildt.prirucnik.git;

public class Svetlo {
	public static void main (String args[]) {
		
	
	int brzinaSvetlosti;
	long brojDana;
	long brojSekundi;
	long rastojanje;
	
	//priblizna brzina svetlosti
	
	brzinaSvetlosti = 186000;
	
	brojDana= 1000; //zadajte ovde broj dana
	
	brojSekundi= brojDana*24*60*60;
	
	rastojanje= brzinaSvetlosti * brojSekundi;
	
	System.out.println("Za " + brojDana);
	System.out.println("dana svetlost ce preci oko");
	System.out.println(rastojanje+ " milja" );
	}
}
