package br.edu.figplanas;

public class Triangulo extends FigGeoPlana {
	private double base;
	private double altura;

	public void calcArea() {
		area = (base * altura)/2;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void listaAtributos() {
		System.out.println("Base do triangulo: " + base);
		System.out.println("Altura do triangulo: " + altura);
		System.out.println("Área do triangulo: " + area);
	}
}
