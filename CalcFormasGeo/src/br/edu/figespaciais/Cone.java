package br.edu.figespaciais;

public class Cone extends FigGeoEspaciais{
	private int raio;
	private int altura;
	private int geratriz;

	public void calcAreaTotal() {
		areaTotal = (int) ((Math.PI * raio * geratriz) + (Math.PI * Math.pow(raio, 2)));
	}

	public void calcAreaLateral() {
		areaLateral = (int) (Math.PI * raio * geratriz);
	}

	public void calcVolume() {
		areaVolume = (int) (((Math.PI * Math.pow(raio, 2)) * altura))/3;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setGeratriz(int geratriz) {
		this.geratriz = geratriz;
	}
}
