package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave7 {

	public static void main(String[] args) {
		
		int antFeil = 0;
		
		for (int antStud = 10; antStud > 0; antStud-= 1) {
			if (antFeil > 0) {
				antStud++;
				antFeil--;
			}
		
		int poeng = Integer.parseInt(showInputDialog("Poeng? :"));
		int S = 100;
		int A = 90;
		int B = 80;
		int C = 60;
		int D = 50;
		int E = 40;
		int F = 0;
		
		if (A <= poeng && poeng <= S) {
			System.out.println("A");
		} else {
			if (poeng >= B && poeng <= A) {
				System.out.println("B");
			} else {
				if (poeng >= C && poeng <= B) {
					System.out.println("C");
				} else {
					if (poeng >= D && poeng <= C) {
						System.out.println("D");
					} else {
						if ( poeng >= E && poeng <= D) {
							System.out.println("E");
						} else {
							if (poeng >= F && poeng <= E) {
								System.out.println("F");
							} else {
								if (poeng < F || poeng > S)
									System.out.println("Dette er ikke gyldig poengsum, skriv inn rett poengsum");
									antFeil++;
								}
							}
						}
					}
				}
			}
		}
	}
}