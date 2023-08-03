package Exercice_fonction_enonce3;


/*
 * FONCTION Reel calculMoyenne(reel a, reel b)
 * moyenne est un reel
 * moyenne <-- (a+b)/2
 * retourne moyenne
 * FIN FONCTION
 * VARIABLES
 * 	nombre1 est un reel
 * 	nombre2 est un reel
 * DEBUT DU PROGRAMME
 * 	Ecrire "Saisir le 1er nombre"
 * 	Lire nombre1
 *  Ecrire "Saisir le 2ieme nombre"
 * 	Lire nombre2
 * 	Ecrire "la moyenne des 2 nombres est : ", moyenne ( nombre1,nombre2)
 * FIN DU PROGRAMME
 */


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double nombre1, nombre2;
		
		Scanner sc= new Scanner(System.in);
			System.out.println("Entrez le premier nombre : ");
			nombre1 = sc.nextDouble();
			System.out.println("Entrez le second nombre : ");
			nombre2 = sc.nextDouble();
		
			System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est : " + moyenne(nombre1, nombre2));
		sc.close();
	}
	
	private static double moyenne(double a, double b) {
		double resultat = (a + b) / 2;
		return resultat;
		
	}

}