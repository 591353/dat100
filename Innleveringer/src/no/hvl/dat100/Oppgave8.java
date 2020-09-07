package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave8 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Verdien av fakultet "));
		int Tall = n;
		int i = 1;
		int antall = 1;
		
		if (n >= 0) {
			while (n > 1) {
				int sum = n*i;
				antall = antall * sum;
				n--;
			} showMessageDialog(null, Tall + "! = " + antall);
		} else {
			showMessageDialog(null, "Skriv inn et posetivt tall i input");
		}
	}
}
