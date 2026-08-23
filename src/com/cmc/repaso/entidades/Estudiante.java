package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;
	
	//examne
	private double asistencia;
	
	//constructor
	public Estudiante(String nombre, double asistencia) {
		this.nombre=nombre;
		this.asistencia=asistencia;
		
	}
	
	//metodo
	
	public void calificar(double nota,double asistencia ) {
		this.asistencia=asistencia;
		this.nota=nota;
		if(nota< 8 ) {
			System.out.println(nombre);
			System.out.println(nota);
			System.out.println("F");
			this.resultado="F";
		}else if(nota>=8 && asistencia>=80) {
			System.out.println(nombre);
			System.out.println(nota);
			System.out.println("A");
			resultado="A";
		}else if(nota>=8 && asistencia<80) {
			System.out.println(nombre);
			System.out.println(nota);
			System.out.println("X");
			resultado="X";
	}
	
}
}
