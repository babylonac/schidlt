package com.schildt.prirucnik.git;

public class PrimerZaBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		b= false;
		System.out.println("b je " + b);
		b= true;
		System.out.println("b je " + b);
		
		//logièka vrednost moze da upravlja naredbom if
		
		if(b) System.out.println("Ovo se prikazuje");
		
		b= false;
	
		if(b) System.out.println("Ovo se ne prikazuje");
		
		//rezultat primene relacionog operatora je vrednost logièkog tipa
		
		System.out.println("10>9 je " +(10>9));
		
	}

}
