package Exercice2_7;

import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		
			double  kilo = 0;
			double	miles = 0;
			String kiloError;
			boolean legit = false;
			
		Scanner scanner = new Scanner(System.in);
			while (legit == false) {
				System.out.println("Entrez le nombre de kilometres entre 0.01 et 1.000.000 (ou entrez \"q\" ou \"Q\" pour quitter) : ");
				if (scanner.hasNextDouble()) { // méthode qui "détecte" le type de la saisie et renvoit "true" ou "false" selon le type renseigné
					kilo = scanner.nextDouble(); // ici, un double
					if (kilo < 0.01 || kilo > 1000000) {
						System.out.println("Entree invalide !");
					}else {
						legit = true;
						scanner.close();
					}
				}else { // les autres types passent dans le else, comme ici une chaine de caractères
					kiloError = scanner.next().toLowerCase();
					if (kiloError.equals("q")) {
						System.exit(0); // quitte le programme
					}else {
						System.out.println("Entree invalide !");
					}
				}
			}
			
			miles = Math.round((kilo/1.609)*100.0)/100.0;
			System.out.println(kilo + "km donne : " + miles + " miles");		
		
	}
}