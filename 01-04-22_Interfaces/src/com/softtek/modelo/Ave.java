package com.softtek.modelo;

public class Ave implements ObjetoVolador {

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "El ave esta despegando";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "El ave esta aterrzando";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "EL ave esta volando";
	}
	
	public String hacerNido() {
		return "Ave haciendo nido";
	}
	
	public String ponerHuevos() {
		return "Ave poniendo huevos";
	}

}
