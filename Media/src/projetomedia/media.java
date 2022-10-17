package projetomedia;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite Tres Valores: ");
		
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		
		double media = ((n1 + n2 + n3) / 3);
		
		System.out.println("O Resultado e : " + media);
	}

}
