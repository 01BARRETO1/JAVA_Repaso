package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;
	
	//constructor
	public Estudiante(String nombre) {
		this.nombre=nombre;
		
	}
	
	//metodo
	
	public void calificar(double nota) {
		this.nota=nota;
		if(nota< 8 ) {
			System.out.println(nombre);
			System.out.println(nota);
			System.out.println("F");
			this.resultado="F";
		}else if(nota>=8) {
			System.out.println(nombre);
			System.out.println(nota);
			System.out.println("A");
			resultado="A";
		}
	}
	
}
