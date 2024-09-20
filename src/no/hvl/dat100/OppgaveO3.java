package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn et positivt heltall: ");
		int n = scanner.nextInt();
		
		if (n > 0) {
			int fakultet = 1;
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
			
		/*Forklaring på for løkken oven for er slik:
		 * Setter inn et tall feks 5
		 * Startet på 1 siden int i = 1 og plusser med 1 etter hvert tall
		 * Slik at det starter med 1 x 1 = 1
		 * Putter 1 for n og plusser i med 1 slik at det blir 1 x 2 = 2
		 * Putter 2 for n og plusser i med 1 slik at det blir 2 x 3 = 6
		 * Putter 6 for n og plusser i med 1 slik at det blir 6 x 4 = 24
		 * Putter 24 for n og plusser i med 1 slik at det blir 24 x 5 = 120
		 */
			
		
		System.out.println("Fakultet av " + n + " er " + fakultet);
		} else {
			System.out.println("Talle må være større enn 0");
		}
		
		scanner.close();
		
	}

}
