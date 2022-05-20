package com.softtek.modelo;

public class HidroAvion extends Avion implements Nautico {

	@Override
	public String atracar() {
		// TODO Auto-generated method stub
		return "Hidro Avion Atracando";
	}

	@Override
	public String navegar() {
		// TODO Auto-generated method stub
		return "Hidro Avion Navegando";
	}

}
