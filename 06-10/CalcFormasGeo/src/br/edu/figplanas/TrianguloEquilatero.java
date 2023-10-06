/** aprendendo a programar
 * 
 */
package br.edu.figplanas;

/**
 * @author Alunos
 *
 */
public class TrianguloEquilatero {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = ((Math.pow(lado, 2) * Math.sqrt(3))/4);
	}
}
