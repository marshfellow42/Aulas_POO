package br.edu.principal;

import java.util.Scanner;

import br.edu.figplanas.*;
import br.edu.figespaciais.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("""
				1 - Figuras Planas
				2 - Figuras Espaciais
				""");
		
		System.out.print("Escolha uma das operações: ");
		int esc = sc.nextInt();
		
		System.out.println("");
		
		if (esc == 1) {
			System.out.print("""
					t - Triângulo,
					q - Quadrado,
					te - Triângulo Equilátero,
					""");
			
			System.out.print("Qual a figura plana na qual você deseja descobrir a área?: ");
			String escArea = sc.next();
			
			if (escArea == "t") {
				System.out.print("Você deseja ver um triangulo regular ou um triangulo equilatero?: ");
				String escTri = sc.next();
				
				if (escTri == "regular" || escTri == "r" || escTri == "re") {
					Triangulo t = new Triangulo();

					System.out.print("Coloque a base do triangulo: ");
					t.setBase(sc.nextInt());
					System.out.print("Coloque a altura do triangulo: ");
					t.setAltura(sc.nextInt());

					t.calcArea();
					
					System.out.println("");
					
					t.listaAtributos();
				}
				
				else if (escTri == "equilatero" || escTri == "e" || escTri == "eq")  {
					
				}
				
			}
			
			if (escArea == "q") {
				Quadrado q = new Quadrado();

				System.out.print("Coloque o lado do quadrado: ");
				q.setLado(sc.nextInt());
				
				q.calcArea();
				
				System.out.println("");
				
				q.listaAtributos();
			}

			
			
		}
		
		else if (esc == 2) {
			
		}

	}

}
