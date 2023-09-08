package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int linha = 3;
		int coluna = 3;
		int numero = 1;
		
		int num [] [] = new int [linha] [coluna];
		
		for (int x = 0; x < num.length; x++) {;
			for (int y = 0; y < num[x].length; y++) {
				num [x][y] = numero;
				numero++;
				System.out.print(num[x][y]);								
			}
			System.out.print("\n");
		}
		
	}

}
