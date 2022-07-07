package EstruturaRepeticao;

import java.util.Scanner;

public class ValoresWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade;
		
		
		while(true) {
			System.out.println("Digite o nome");
			nome = entrada.next();
			if(nome.equals("0"))   break;
			System.out.println("Digite a Idade ");
			idade = entrada.nextInt();
		}

		System.out.println("Comando invalido, rode novamente ");

	}

}
