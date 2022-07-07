package EstruturaRepeticao;

import java.util.Scanner;

public class NotaWhile {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		int nota;
		
		System.out.print("Digite uma nota");
		nota = entrada.nextInt();
		
		
		while (nota <0 |nota >10) {
			System.out.print("Digite uma nota valida de 0 a 10");
			nota = entrada.nextInt();
		}
		
		System.out.print("obrigada");
	}

}
