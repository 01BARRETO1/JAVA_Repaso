package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante calificacion=new Estudiante("Barreto", 1.0);
		calificacion.calificar(10.0, 100.0);
		//
		Estudiante calificacion1=new Estudiante("Barreto", 1.0);
		calificacion1.calificar(9.0, 85.0);
		Estudiante calificacion2=new Estudiante("Barreto", 1.0);
		calificacion2.calificar(9.0, 70.0);
		Estudiante calificacion3=new Estudiante("Barreto", 1.0);
		calificacion3.calificar(5.0, 95.0);
		
	}

}
