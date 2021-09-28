package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		
		System.out.print("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + " ");
			
		}
		
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String number = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length-1) {
				number += tabell[i] + ",";
				
			}else 
				
				number += tabell[i];
		}
		
		number += "]";
		return number;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// for løkke
		
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
			
		}
		
		System.out.println(sum + ", ");
		return sum;
	}
	
	
	/* While løkke
	
	int sum = 0;
	int i = 0;
	while (i < tabell.length) {
		sum += tabell[i];
		i++;
	}
	System.out.println(sum);
	return sum;
	}
	*/
		
		/* utvidet for løkke /
		
		int sum = 0;
		for (int tall:tabell)
			sum += tall;
		
		return sum;
	}
	
	*/

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		
	int pos = 0;
	while(!funnet && pos < tabell.length) {
		if(tall == tabell[pos]) {
			funnet = true;
		}
		
		pos++;
	}
	
	return funnet;
}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;
		
		for (int i = 0; i < tabell.length && index == -1; i++)
			if (tabell[i] == tall)
				index = i;
		
		return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		
		int[] nyTabell = new int[tabell.length];
		int telling = tabell.length-1;
		
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[telling];
			telling--;
			
		}
		
		return nyTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		for (int i = 0; i < tabell.length -1 && sortert; i++) 
			if (tabell[i] > tabell[i + 1])
				sortert = false;
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammen = new int[tabell1.length + tabell2.length];
				
				for (int i = 0; i < tabell1.length; i++)  {
					sammen[i] = tabell1[i];
				}
				
				for (int j=0; j<tabell2.length; j++) {
					sammen[tabell1.length + j] = tabell2[j];
					
				}
				
				return sammen;
	}
}
