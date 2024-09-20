package no.hvl.dat100;

import java.util.Scanner;
// Trinnskatt
public class OppgaveO1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Skriv inn bruttoinntekt: ");
		double bruttoinntekt = scanner.nextDouble();
		
		double skatt = 0.0;
		
		if (bruttoinntekt > 208050) {
			//Trinn 1
			if (bruttoinntekt <= 292850) {
				skatt = (bruttoinntekt - 208050) * 0.017;
				//Trinn 2
			}else {
				skatt += (292650 - 208050) * 0.0017;	
			}
				if (bruttoinntekt > 670000) {
					skatt += (bruttoinntekt - 292851) * 0.04;
				}else {
				skatt += (670000 - 292851) * 0.04;
					//Trinn 3
					if (bruttoinntekt > 937900) {
						skatt += (bruttoinntekt - 670001) * 0.136;
					}else {
					skatt += (937900 - 670001) * 0.136;
						//Trinn 4
						if (bruttoinntekt > 1350000) {
							skatt += (bruttoinntekt - 937901) * 0.166;
						}else {
						skatt += (1350000 - 937901) * 0.166;
			
					}
				}
			}
		}
        System.out.printf("Trinnskatten som skal betales er: %.0fkr\n",skatt);
	}

}
