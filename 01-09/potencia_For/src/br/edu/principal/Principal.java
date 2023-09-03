package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// Variáveis principais do sistema
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int exp = sc.nextInt();
		int result = 0;
		
		
		for (int i = exp; i >= 1; i--) {
			if (result == 0 & i == 1) {
				result = result + num;
			}
			
			if (result == 0 & i > 1) {
				result = num * num;
				//Quando uma operação aqui é completada, ela diminui 1 do expoente, 
				//pois uma operação já foi realizada, 
				//se não o valor dela vai ser utilizado na outra operação, 
				//e eu não posso dar um break pois toda a operação iria cair
				i--;
			}
			
			if (result > 0 & i > 1) {
				result = result * num;
			}
		}
		
		System.out.println(result);
	}

}
