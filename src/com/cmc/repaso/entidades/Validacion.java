package com.cmc.repaso.entidades;

public class Validacion {
	
	
	//
	public boolean validadrMonto(double monto) {
		
		if(monto>0) {
			System.out.println("True");
			return true;
			
		}
		System.out.println("False");
		return false;
		
	}

}
