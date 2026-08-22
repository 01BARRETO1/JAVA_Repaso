package com.cmc.repaso.entidades;

public class Producto {
	
	private String nombre;
	private double precio;
	
	//constructor
	public Producto(String nombre,double precio ) {
		this.nombre=nombre;
		this.precio=precio;
	}
	//setPrecio

	public void setPrecio(double precio) {
		this.precio = precio;
		if(precio<0) {
			System.out.println("valor incorrecto: "+precio);
			precio+=precio*(-1);
			System.out.println("precio: "+precio);
		}
	}
	
	public double calcularPrecioPromo(int porcentajeDescuento) {
		double descuento =(precio*porcentajeDescuento)/100;
		double result = precio-descuento;
		System.out.println("precio aplicado el descuento: $"+result);
		return result;
	}

}
