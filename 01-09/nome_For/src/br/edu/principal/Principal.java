package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		for (int rep = 1; rep < 101; rep++) {
			System.out.println(nome + " " + rep);
		}
		
	}

}