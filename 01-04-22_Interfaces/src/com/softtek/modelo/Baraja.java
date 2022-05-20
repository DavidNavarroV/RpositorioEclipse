package com.softtek.modelo;

public class Baraja {
	private Carta[] cartas;
	
	public void Barajar() {
		for(int i = 0; i < 52;i++) {
			cartas[i] = new Carta(Palo.BASTOS,Numero.AS,false);
		}
	}
	
	public Carta sacarCarta() {
		
			int num = (int) Math.round(Math.random()*53);
			
			
			do {
		    num = (int) Math.round(Math.random()*53);
			return cartas[num];
			
			}while(cartas[num].isExtraida());
	}	
}
