package Arrays;

import java.util.Random;

public class ArraysMultidimensionais {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int[][] M = new int[4][4];

		// i significa linha j a coluna
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = aleatorio.nextInt(9);
			}
		}
		
		System.out.println("matriz");
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + "");
			}
			System.out.println();
		}
	}

}
