package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int num[] = new int [5];
		for (int i = 1; i < num.length; i++) {
			System.out.print("Digite o " + i + "° número: ");
			int x = sc.nextInt();
			if (x%2 == 0) {
				num[i] = x*2;
				System.out.println("par: " + num[i]);
			}
			if (x%2 != 0) {
				num[i] = x*3;
				System.out.println("ímpar: " + num[i]);
			}
		}
	}
}
