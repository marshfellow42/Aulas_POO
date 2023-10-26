package br.edu.figespaciais;

public class Cilindro extends FigGeoEspaciais{
	private int raio;
	private int altura;
	
	public void calcAreaTotal() {
		areaTotal = (2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio, 2)); 
	}
	
	public void calcVolume() {
		areaVolume = (Math.PI * Math.pow(raio, 2) * altura);
	}
	
	public void listaAtributos() {
		System.out.println("A área total do cilíndro é: " + areaTotal);
		System.out.println("O volume do cilíndro é: " + areaVolume);
	}
}
