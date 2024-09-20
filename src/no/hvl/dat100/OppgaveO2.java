package no.hvl.dat100;
import java.util.Scanner;

public class OppgaveO2 {
	// Karakterskala
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int j = 1; j <= 10; j++) {
			int poeng;
			
			while (true) {
				System.out.println("Skrive inn poeng for student " + j + ": ");
				poeng = scanner.nextInt();
			
				if (poeng >= 0 && poeng <= 100) {
					break;
				}else {
					System.out.println("Ugylding poengsum.");
				}
			}
		
			if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter: A");
			} else if (poeng >= 80 && poeng <= 89) { 
				System.out.println("Karakter: B");
			}else if (poeng >= 60 && poeng <= 79) {
				System.out.println("Karakter: C");
			}else if (poeng >= 50 && poeng <= 59) {
				System.out.println("Karakter: D");
			}else if (poeng >= 40 && poeng <= 49) {
				System.out.println("Karakter: E");
			}else if (poeng >= 0 && poeng <= 39){
				System.out.println("Karakte: F");
			}
		}
	}
}
