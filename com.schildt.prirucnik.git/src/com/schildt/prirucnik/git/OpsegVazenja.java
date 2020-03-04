package com.schildt.prirucnik.git;

public class OpsegVazenja {

	public static void main(String[] args) {
		int x; //vidljiva unutar metode main
		
		x=10;
		
		if(x==10) { //pocetak novog opsega
			int y=20; //vidljiva samo u ovom bloku
			
		//ovde se vide i x i y
			System.out.println("x i y: "+x+ " "+y);
			x= y*2;
			
		}
		
		//y=100; //Greška ovde se y ne vidi
		
		// x se ovde jos uvek vidi
		System.out.println("x je "+ x);

	}

}
