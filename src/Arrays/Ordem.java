package Arrays;

public class Ordem {

	public static void main(String[] args) {
		
		int [] ordemInversa= {3,-9,7,6,3,-6};
		
		System.out.println("Array ordemInversa");
		int count = 0;
		while (count < (ordemInversa.length )-1) {
		System.out.print(ordemInversa[count]+ "  ");	
		count ++;
		}

		System.out.println("\n Array ordemInversa");
		for(int i  = (ordemInversa.length -1); i >= 0; i-- ) {
			System.out.print(ordemInversa[i]+ "  ");
		}
		
		
	}

}
