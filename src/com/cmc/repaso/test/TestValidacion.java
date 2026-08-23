package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion monto=new Validacion();
		//Guardamos en una variable retorno de tipo boolean para registrar el retorno
		boolean retorno = monto.validarMonto(-2.0);//llamamos al metodo validarMonto
		System.out.println(retorno);
		
		boolean retorno1 = monto.validarMonto(10.0);
		System.out.println(retorno1);

	}

}
