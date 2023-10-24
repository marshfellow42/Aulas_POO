/** aprendendo a programar
 * 
 */
package br.edu.figplanas;

/**
 * @author Alunos
 *
 */
public class Circulo extends FigGeoPlana {
	private double raio;
	
	public void calcArea() {
		area = Math.PI * Math.pow(raio, 2);
	}
}
