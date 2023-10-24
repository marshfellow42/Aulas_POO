/** aprendendo a programar
 * 
 */
package br.edu.figplanas;

/**
 * @author Alunos
 *
 */
public class TrianguloEquilatero extends FigGeoPlana {
	private double lado;
	
	public void calcArea() {
		area = ((Math.pow(lado, 2) * Math.sqrt(3))/4);
	}
}
