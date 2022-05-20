package com.softtek.modelo;

public class Alumno {
	public String nombre;
	public double[] notasParciales;
	
	
	public void guardarNota(int parcial , double nota) {
		this.notasParciales[parcial] = nota;
	}
	
	public double promedio() {
		double nota = 0;
		for (double d : notasParciales) {
			nota += d;
		}
		return nota/this.notasParciales.length;
	}
	
	
	
	
	
	
	
		
	
}
