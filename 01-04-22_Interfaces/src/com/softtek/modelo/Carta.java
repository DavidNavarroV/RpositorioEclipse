package com.softtek.modelo;

public class Carta {
	private Palo palo;
	private Numero numero;
	private boolean extraida;
	
	public Carta() {
		super();
	}
	
	

	public Carta(Palo palo, Numero numero, boolean extraida) {
		super();
		this.palo = palo;
		this.numero = numero;
		this.extraida = extraida;
	}



	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public boolean isExtraida() {
		return extraida;
	}

	public void setExtraida(boolean extraida) {
		this.extraida = extraida;
	}
	
	
	
}
