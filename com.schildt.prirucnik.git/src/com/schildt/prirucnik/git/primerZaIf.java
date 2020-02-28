package com.schildt.prirucnik.git;

class PrimerZaIf {
	public static void main (String args[]) {
		int x,y;
		
		x=10;
		y=20;
		
		if (x<y) System.out.println("x je manje od y");
		
		x=x*2;
		
		if (x==y) System.out.println("x je sada jednako y");
		
		x=x*2;
		
		if (x>y) System.out.println("x je sad vece od y");
		
		if (x==y) System.out.println ("ovo necete videti");
		
	}
}