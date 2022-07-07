package EstruturaRepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {
      public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Qual tabuada deseja?  ");
		int tabuada = entrada.nextInt();
    	  
    	 System.out.println("tabuada: "   + tabuada);
    	 
    	 
    	 for (int i = 1; i<= 10; i++) {
			 System.out.println( tabuada + "x" + i + "=" + (tabuada * i));
			
		}
	}
}
