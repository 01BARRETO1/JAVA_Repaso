package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto prueba=new Producto("Calculadora", 16.00);
		prueba.setPrecio(-4);
		
		Producto prueba2=new Producto("Calculadora", 100.00);
		prueba2.calcularPrecioPromo(30);
		
	}

}
