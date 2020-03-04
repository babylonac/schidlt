package com.schildt.prirucnik.git;

public class DinamickaInicijalizacija {

	public static void main(String[] args) {
	
		double a=3.0, b=4.0;
		
		//c se inicijalizuje dinamicki
		
		double c= Math.sqrt(a*a+b*b);
		System.out.println( "hipotenuza je "+c);

	}

}
