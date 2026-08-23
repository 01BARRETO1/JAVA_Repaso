package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	//para asignar nombre y productos actuales se crea set and get 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	//Aquí los metododos imprimir, vender y devolver
	public void imprimir() {
		
		System.out.println("-----------------------------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
		System.out.println("-----------------------------------------");
	} 
	
	public void vender(int productosVendidos) {
		
		this.productosVendidos+=productosVendidos;
		this.productosActuales=productosActuales-productosVendidos;
				
	}
	
	public void devolver(int productosDevueltos) {
		this.productosDevueltos+=productosDevueltos;
		this.productosActuales+=productosDevueltos;
		this.productosVendidos-=productosDevueltos;
	}
	
}
