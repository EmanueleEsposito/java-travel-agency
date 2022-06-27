package jana60;

import java.util.Scanner;

public class Agenzia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Chiedo all'operatore se vuole inserire una nuova vacanza o uscire
		boolean finito = false;
		while (!finito) {
			// Menù a scelta multipla
			System.out.println("Cosa vuoi fare?");
			System.out.println("1 per inserire una nuova vacanza - 2 per uscire");
			String scelta = scan.nextLine();
			// In base alla scleta dell'utente
			switch (scelta) {
			case "1":
				// Inserire nuova vacanza
				System.out.println("Inserisci la destinazione: ");
			}
		}

		scan.close();

	}

}
