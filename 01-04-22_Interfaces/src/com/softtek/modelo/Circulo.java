package com.softtek.modelo;

import java.util.Objects;

public class Circulo extends Punto {
	private double radio;

	@Override
	public String posicion() {
		// TODO Auto-generated method stub
		return super.posicion() + " con un radio de " + this.radio + " cm";
	}
	
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 2*Math.PI*Math.pow(radio, 2);
	}
	



	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}



	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}



	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	
	
	
	
}
