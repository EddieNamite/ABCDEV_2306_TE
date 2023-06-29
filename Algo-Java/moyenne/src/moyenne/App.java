package moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration des variables
		int nombre1;
		int nombre2;
		double resultat;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		// Saisie des nombres
		System.out.println("Saisir le 1er nombre ");
		nombre1 = sc.nextInt();
		
		System.out.println("Saisir le 2ième nombre ");
		nombre2 = sc.nextInt();
		
		// Calcul du résultat
		resultat = (nombre1 + nombre2) / 2d;
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + resultat);	
		sc.close();
	}

}
