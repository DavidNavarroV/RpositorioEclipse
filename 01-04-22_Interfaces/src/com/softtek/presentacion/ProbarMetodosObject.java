package com.softtek.presentacion;

import com.softtek.modelo.Circulo;

public class ProbarMetodosObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o1 = new Object();
		System.out.println(o1.toString());

		Object o2 = new  Object();
		System.out.println("Objeto 1 es igual a objeto 2 -> " + o1.equals(o2));
		
		Object o3 = o1;
		System.out.println("Objeto 3 es igual a objeto 1 -> " + o1.equals(o3));
		
		Circulo c1 = new Circulo(1,2,3);
		Circulo c2 = new Circulo(1,2,3);
		System.out.println("Objeto 1 es igual a objeto 2 -> " + c1.equals(c2));
		System.out.println(c1.toString());
		
		
	}

}
