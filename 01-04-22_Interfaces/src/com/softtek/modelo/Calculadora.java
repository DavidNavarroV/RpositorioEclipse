package com.softtek.modelo;

public class Calculadora {
	
	public static double sumar(double num1 , double num2) {
		return num1 + num2;
	}
	
	public static double restar(double num1 , double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1 , double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1 , double num2) {
		return num1 / num2;
	}
	
	public static double elevar(double num1 , double num2) {
		return Math.pow( num1, num2);
	}
	
}
