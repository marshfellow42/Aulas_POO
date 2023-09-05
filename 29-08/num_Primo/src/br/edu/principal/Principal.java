package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int j = 2; j <= num; j++) {
			int count = 0;
			for(int i = 1; i<=j;i++) {
				if (j%i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(j+" ");
			}
		}
		
	}
}