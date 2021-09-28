package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad : matrise)  {
			for(int i : rad) {
				System.out.print(i + ",");
			}
			
			System.out.println("");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String Streng = "";
		for(int [] rad : matrise) {
			for(int i : rad) {
				Streng += i + " ";
			}
			
			Streng +="\n";
			
			}
		return Streng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [] [] matriseA = new int[matrise.length][matrise[0].length];
		
		for (int rad = 0; rad < matrise.length; rad++) {
			for(int i = 0; i < matrise[rad].length; i++) {
				matriseA[rad][i] = matrise[rad][i]*tall;
			}
			
		}
			return matriseA;
		}
	


	// d)
	public static boolean erLik(int[][] a, int[][] b) {

	boolean erLike = true;
	
	if(a.length != b.length)
		erLike = false;
	
	if (a.length > 0 && b.length > 0 && erLike)
		if (a[0].length != b[0].length)
			erLike = false;
	
	for (int y = 0; y < a.length && erLike; y++) 
		for (int x = 0; x < a[y].length && erLike; x++)
			if (a[y][x] != b[y][x])
				erLike = false;
	
	
	return erLike;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise[0].length][matrise.length];
		
		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				nyMatrise[x][y] = matrise[y][x];
						
		return nyMatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
		
	//fikk ikke denne til..
	
	}
}
