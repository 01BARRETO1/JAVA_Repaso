package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item objet = new Item();
		objet.setProductosActuales(20);
		objet.imprimir();
		//Probar el resto de los metodos
		objet.setNombre("Manzanas");
		objet.vender(10);
		objet.imprimir();
		//
		objet.devolver(5);
		objet.imprimir();

	}

}
