/** aprendendo a programar
 * 
 */
package br.edu.figplanas;

/**
 * @author Alunos
 *
 */
public class Quadrado extends FigGeoPlana {
	private double lado;
	
	public void calcArea() {
		area = lado * lado;
	}
	
	public void setLado(double lado) {
		System.out.print("Coloque o lado do quadrado: ");
		this.lado = lado;
	}
	
	public void listaAtributos() {
		System.out.println("Base do quadrado: " + lado);
		System.out.println("Área do quadrado: " + area);
	}
}

