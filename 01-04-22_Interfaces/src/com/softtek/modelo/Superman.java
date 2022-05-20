package com.softtek.modelo;

public class Superman implements ObjetoVolador {

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Superman despegando";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Superman aterrizando";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Superman volando";
	}
	
	public String saltarEdificio() {
		return "Superman saltando edificio";
	}
	
	public String detenerBala() {
		return "Superman deteniendo bala";
	}


}
