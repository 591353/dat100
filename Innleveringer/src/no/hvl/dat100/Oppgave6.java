package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		double inntekt = Double.parseDouble(showInputDialog("Inntekt :"));
		double Trinn1 = 164101;
		double Trinn2 = 230951;
		double Trinn3 = 580651;
		double Trinn4 = 934051;
		double sats1 = 0.0093; double Skatt1 = inntekt - inntekt * sats1;
		double sats2 = 0.0241; double Skatt2 = inntekt - inntekt * sats2;
		double sats3 = 0.1152; double Skatt3 = inntekt - inntekt * sats3;
		double sats4 = 0.1452; double Skatt4 = inntekt - inntekt * sats4;
		
		if (inntekt < Trinn1) {
			System.out.println("Med en inntekt på " + inntekt + "kr vil man havne i sats0 og dermed slipper man å betale skatt");
		} else {
			if (inntekt < Trinn2) {
				System.out.println("Med en inntekt på " + inntekt + "kr vil man havne i sats1 og dermed betale 0,93% i skatt"
						+ " og sitter dermed igjenn med " + Skatt1 + "kr etter skatt");
			} else {
				if (inntekt < Trinn3) {
					System.out.println("Med en inntekt på " + inntekt + "kr vil man havne i sats2 og dermed betale 2,41% i skatt"
							+ " og sitter dermed igjenn med " + Skatt2 + "kr etter skatt");
				} else {
					if (inntekt < Trinn4) {
						System.out.println("Med en inntekt på " + inntekt + "kr vil man havne i sats3 og dermed betale 11,52% i skatt"
								+ " og sitter dermed igjenn med " + Skatt3 + "kr etter skatt");
					} else {
						if (inntekt >= Trinn4) {
							System.out.println("Med en inntekt på " + inntekt + "kr vil man havne i sats4 og dermed betale 14,52% i skatt"
									+ " og sitter dermed igjenn med " + Skatt4 + "kr etter skatt");
						}
					}
				}
			}
		}
	}
}
