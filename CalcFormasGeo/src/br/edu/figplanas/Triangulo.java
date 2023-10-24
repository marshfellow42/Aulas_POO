package br.edu.figplanas;

public class Triangulo extends FigGeoPlana {
	private double base;
	private double altura;
	//If else: triangulo qualquer e triangulo equilatero

	public void calcArea() {
		area = (base * altura)/2;
	}
	
	public void calcArea_v2(double h) {
		area = (base * h)/2;
	}
	
	public void calcArea_v3(double b, double h) {
		area = (b * h)/2;
	}
}
