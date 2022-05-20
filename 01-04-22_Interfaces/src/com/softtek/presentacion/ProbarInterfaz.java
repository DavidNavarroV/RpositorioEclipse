package com.softtek.presentacion;

import com.softtek.modelo.Ave;
import com.softtek.modelo.Avion;
import com.softtek.modelo.Barcaza;
import com.softtek.modelo.HidroAvion;
import com.softtek.modelo.ObjetoVolador;
import com.softtek.modelo.Superman;

public class ProbarInterfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjetoVolador a1 = new Avion();
//		System.out.println(a1.despegar());
//		System.out.println(a1.volar());
//		System.out.println(a1.aterrizar());
//		
		ObjetoVolador ave1 = new Ave();
//		System.out.println(ave1.despegar());
//		System.out.println(ave1.volar());
//		System.out.println(ave1.aterrizar());
//		
		ObjetoVolador s1 = new Superman();
//		System.out.println(s1.despegar());
//		System.out.println(s1.volar());
//		System.out.println(s1.aterrizar());
		
		ObjetoVolador ha1 = new HidroAvion();
		
		
		
		
		ObjetoVolador[] voladores = new ObjetoVolador[3];
		voladores[0] = a1;
		voladores[1] = ave1;
		voladores[2] = s1;
		
		for (ObjetoVolador objetoVolador : voladores) {
			System.out.println(objetoVolador.despegar());
			System.out.println(objetoVolador.volar());
			System.out.println(objetoVolador.aterrizar());
				
			if(objetoVolador instanceof Ave) {
				System.out.println(((Ave)objetoVolador).hacerNido());
			}else if(objetoVolador instanceof Superman) {
				System.out.println(((Superman)objetoVolador).detenerBala());
				System.out.println(((Superman)objetoVolador).saltarEdificio());
				
			}
		}

	}

}
