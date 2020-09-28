package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	
	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int i:tabell)
			System.out.println(i);
		
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		
	}

	
	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
		
		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length - 1) {
				streng += tabell[i];
			} else {
				streng += tabell[i] + ",";
			}
		}
		return streng += "]";
		
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
		
		int summer = 0;
		//1. Metode (for løkke)
		/*
		for (int antall = 0; antall < tabell.length; antall++) {
			summer += tabell[antall];
		}
		return summer;
		*/
		//2. Metode (while løkke)
		/*
		int i = 0;
		while (i < tabell.length) {
			summer += tabell[i];
			i++;
		}
		return summer;
		*/
		// 3. Metode (Utvidet for løkke)
		for (int i:tabell) {
			summer += i;
			
		}
		return summer;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
		
		boolean fTall = false;
		for (int i:tabell) {
			if (i == tall) {
				fTall = true;
			}
		}
		return fTall;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");
		
		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				 pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
		for (int i = 0; i < tabell.length/2; i++) {
			int rev = tabell[i];
			tabell[i] = tabell[tabell.length - i -1];
			tabell[tabell.length - i - 1] = rev;
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
		
		boolean sort = true;
		for (int i = 0; i < tabell.length -1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sort = false;
			}
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
		
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyLengde];
		for (int t1 = 0; t1 < tabell1.length; t1++) {
			nyTabell[t1] = tabell1[t1];
		}
		for (int t2 = 0; t2 < tabell2.length; t2++) {
			nyTabell[tabell1.length + t2] = tabell2[t2];
		}
		return nyTabell;
	}
}
