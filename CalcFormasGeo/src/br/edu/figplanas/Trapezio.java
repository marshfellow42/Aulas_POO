/** aprendendo a programar
 * 
 */
package br.edu.figplanas;

/**
 * @author Alunos
 *
 */
public class Trapezio extends FigGeoPlana {
	private double Base;
	private double base;
	private double altura;
	
	public void calcArea() {
		area = ((Base + base)*altura)/2;
	}
}
