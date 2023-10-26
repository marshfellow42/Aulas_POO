/** aprendendo a programar
 * 
 */
package br.edu.figespaciais;

/**
 * @author Alunos
 *
 */
public class Piramide extends FigGeoEspaciais {
	private int base;
	private int lado;
	private int apotema;
	private int altura;
	private int faces;

	public void areaQuadrada() {
		areaBase = lado * lado;
	}

	public void calcApotema() {
		apotema = (int) Math.sqrt(Math.pow(areaBase, 2) + Math.pow(altura, 2));
	}
	
	public void calcAreaLateral() {
		calcApotema();
		areaLateral = faces * ((lado*apotema)/2);
	}

	public void calcAreaTotal() {
		calcAreaLateral();
		areaTotal = areaLateral + areaBase;
	}
	
	public void calcVolume() {
		areaVolume = ((areaBase * altura)/3);
	}
	
	public void listaAtributos() {
		System.out.println("A área lateral da pirâmide é: " + areaLateral);
		System.out.println("A área da base da pirâmide é: " + areaBase);
		System.out.println("A área total da pirâmide é: " + areaTotal);
		System.out.println("O volume da pirâmide é: " + areaVolume);
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public void setApotema(int apotema) {
		this.apotema = apotema;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setFaces(int faces) {
		this.faces = faces;
	}
}
