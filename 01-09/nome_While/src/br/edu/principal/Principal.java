package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		int rep = 0;
		while (rep < 100) {
			rep++;
			System.out.println(nome + " " + rep);
		}
		
	}

}
