package com.schildt.prirucnik.git;

public class JednodimenzionalniNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dani_u_mesecu[];
		dani_u_mesecu =new int[12];
		
		//ili deklaracija i dodeljivanje memorije zajedno
		//int dani_u_mesecu[]= new int[12];
		dani_u_mesecu[0] =31;
		dani_u_mesecu[1] =28;
		dani_u_mesecu[2] =31;
		dani_u_mesecu[3] =30;
		dani_u_mesecu[4] =31;
		dani_u_mesecu[5] =30;
		dani_u_mesecu[6] =31;
		dani_u_mesecu[7] =31;
		dani_u_mesecu[8] =30;
		dani_u_mesecu[9] =31;
		dani_u_mesecu[10] =30;
		dani_u_mesecu[11] =31;
		
	System.out.println("April ima "+ dani_u_mesecu[3]+ " dana.");
	}

}
