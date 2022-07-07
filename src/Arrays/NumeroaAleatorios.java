package Arrays;

import java.util.Random;

public class NumeroaAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = aleatorio.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		System.out.println("\nNumeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero) + "   ");
		}
		System.out.println("\nSucessores dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + "  ");

		}
		System.out.println("\nAntessessores dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + "  ");
		}
	}

}
