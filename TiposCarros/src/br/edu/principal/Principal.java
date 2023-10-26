package br.edu.principal;

import java.util.Scanner;

import br.edu.veiculos.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Jipe j = new Jipe();
		String marca = sc.next();
		double capTanqueComb = sc.nextDouble();
		j.setMarca(marca);
		j.setCapTanqueComb(capTanqueComb);
		
		System.out.print("A marca desse veiculo é" + j.getMarca());
		j.getMarca();
		j.getCapTanqueComb();
	}
}
