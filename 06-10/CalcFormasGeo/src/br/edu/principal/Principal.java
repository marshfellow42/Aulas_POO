package br.edu.principal;

import java.util.Scanner;

import br.edu.figplanas.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangulo t = new Triangulo();
		
		System.out.print("Coloque a base do triangulo: ");
		t.base = sc.nextInt();
		System.out.print("Coloque a altura do triangulo: ");
		t.altura = sc.nextInt();
		
		t.calcArea();
		
		System.out.println("Base do triangulo: " + t.base);
		System.out.println("Altura do triangulo: " + t.altura);
		System.out.println("Área do triangulo: " + t.area);
		
		System.out.println("");
		
		Quadrado q = new Quadrado();
		
		System.out.print("Coloque o lado do quadrado: ");
		q.lado = sc.nextInt();
		q.calcArea();
		
		System.out.println("Base do quadrado: " + q.lado);
		System.out.println("Área do quadrado: " + q.area);
	}

}
