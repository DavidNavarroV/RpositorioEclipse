package com.softtek.modelo;

public abstract class Punto {
	private int x;
	private int y; 
	
	public String posicion() {
		return "( " + this.x + ", " + this.y + " )";
	}
	
	public abstract double calcularArea();

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}


