package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		
		for (int i[]: matrise) {
			for (int j: i) {
            	System.out.print(j);
            }
            System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
		String streng = "";
		
		for (int i[]: matrise) {
			for (int x: i) {
				streng += (x + " ");
			}
			streng += "\n";
		}
		System.out.println(streng);
		return streng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
		
		int nyMatrise [][] = new int [matrise.length][matrise[0].length];
		for ( int i = 0; i < matrise.length; i++) {
			for (int y = 0; y < matrise[i].length; y++) {
				nyMatrise[i][y] = matrise [i][y]* tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
		
		boolean likeTabeller = true;
		int rad1;
		int rad2;
		int kolonne1;
		int kolonne2;
		rad1 = a.length;
		kolonne1 = a[0].length;
		rad2 = b.length;
		kolonne2 = b[0].length;
		
		if (rad1 != rad2 || kolonne1 != kolonne2) {
			likeTabeller = false;
		} else {
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kolonne1; j++) {
					if(a[i][j] != b[i][j]) {
						likeTabeller = false;
					}
				}
			}
		}
		return likeTabeller;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
