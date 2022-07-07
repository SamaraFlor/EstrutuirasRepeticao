package EstruturaRepeticao;

import java.util.Scanner;

public class NumerosDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;
		int maior = 0;
		int soma = 0;

		int count = 0;

		do {
			System.out.println("Digite o numero 5 vezes");
			numero = entrada.nextInt();

			if (numero > maior)
				maior = numero;

			soma = soma + numero;

			count = count + 1;
		} while (count < 5);

		System.out.println("Maior numero   " + maior);
		System.out.println("Media   " + (soma/5));
	}

}
