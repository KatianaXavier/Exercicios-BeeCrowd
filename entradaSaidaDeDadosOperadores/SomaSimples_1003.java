package entradaSaidaDeDadosOperadores;

import java.util.Scanner;

public class SomaSimples_1003 {

	public static void main(String[] args) {

		int A, B, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		A = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = leia.nextInt();
		
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		leia.close();

	}

}
