package br.edu.secundario;

public class Secundario {
	public static void imprimir() {
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("5 - Exponencia��o");
		
	}
 	public int soma(int a, int b) {
		int z = a + b;
		System.out.println("A soma de x e y � " + z);
		return z;
	}	
	
	public int sub(int a, int b) {
		int z = a - b;
		System.out.println("A subtracao de x e y � " + z);
		return z;
	}	
	
	public int div(int a, int b) {
		int z = a / b;
		System.out.println("A divisao de x e y � " + z);
		return z;
	}	
	
	public int mult(int a, int b) {
		int z = a * b;
		System.out.println("A multiplicacao de x e y � " + z);
		return z;
	}	
	
	public int exp(int a, int b) {
		double z = Math.pow(a, b);
		int c = (int)z;
		System.out.println("A exponencial de x e y � " + c);
		return c;
	}	
}
