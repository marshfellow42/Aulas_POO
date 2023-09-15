package br.edu.secundario;

public class Secundario {
	public static void imprimir() {
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Exponenciação");
		
	}
 	public int soma(int a, int b) {
		int z = a + b;
		System.out.println("A soma de x e y é " + z);
		return z;
	}	
	
	public int sub(int a, int b) {
		int z = a - b;
		System.out.println("A subtracao de x e y é " + z);
		return z;
	}	
	
	public int div(int a, int b) {
		int z = a / b;
		System.out.println("A divisao de x e y é " + z);
		return z;
	}	
	
	public int mult(int a, int b) {
		int z = a * b;
		System.out.println("A multiplicacao de x e y é " + z);
		return z;
	}	
	
	public int exp(int a, int b) {
		double z = Math.pow(a, b);
		int c = (int)z;
		System.out.println("A exponencial de x e y é " + c);
		return c;
	}	
}
