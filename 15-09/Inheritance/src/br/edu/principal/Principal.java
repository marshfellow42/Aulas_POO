package br.edu.principal;

import java.util.Scanner;

import br.edu.secundario.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int x = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int y = sc.nextInt();
		Secundario s = new Secundario();
		s.imprimir();
		System.out.print("O que deseja fazer?: ");
		int esc = sc.nextInt();
		if (esc == 1) {
			s.soma(x, y);
		}
		if (esc == 2) {
			s.sub(x, y);
		}
		if (esc == 3) {
			s.mult(x, y);
		}
		if (esc == 4) {
			s.div(x, y);
		}
		if (esc == 5) {
			s.exp(x, y);
		}

		
		
		
		
		

	}

}
