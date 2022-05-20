package com.softtek.modelo;

public class Rectangulo extends Punto {
	private double ancho;
	private double largo;
	
	@Override
	public String posicion() {
		// TODO Auto-generated method stub
		return super.posicion() + " con un ancho de " + this.ancho + " cm y " + this.largo + " cm de largo";
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.ancho * this.largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public Rectangulo(int x, int y, double ancho, double largo) {
		super(x, y);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	
}
