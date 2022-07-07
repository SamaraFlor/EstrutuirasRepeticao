package EstruturaRepeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int contador = 0;
		int qtdPares = 0, qtdImpares = 0;
		
		System.out.println("Qual a quantidade de numeros que deseja");
		quantNumeros = entrada.nextInt();
		
		do {
			System.out.println("numero:  ");
			numero = entrada.nextInt();
			
			if(numero %2 == 0) qtdPares++;
			else qtdImpares++;
			
			// contador para não ficar no loop infinito
			contador++;
		} while (contador < quantNumeros);
		
	System.out.println("Quantidade  pares  " +  qtdPares);
	System.out.println("Quantidade  impares  " +  qtdImpares);
}
	
	
}
