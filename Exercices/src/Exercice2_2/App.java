package Exercice2_2;


/*
 * PSEUDO CODE
 * 	Variables
 * 		a est un entier
 * 		b est un entier
 *
 * 	Debut du programme
 * 		ecire " Saisir le 1er nombre"
 * 		lire <-- nombre a
 * 		ecrire " Saisir le 2eme nombre"
 * 		lire <-- nombre b
 *  debut SI
 *  	si a = b
 *  	ecrire a = b
 *  	si a < b
 *  	ecrire a < b
 *  	si a > b
 *  	ecrire b < a
 * 	Fin SI
 *  Fin du programme
 * 
 */





import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Déclaration des variables
		int nombrea;
		int nombreb;
		
		Scanner sc = new Scanner(System.in);
		
		// Saisie des nombres
		System.out.println("Saisir le 1er nombre ");
		nombrea = sc.nextInt();
		
		System.out.println("Saisir le 2ième nombre ");
		nombreb = sc.nextInt();
		
		// Calcul du tri
		
		if(nombrea == nombreb)
		{
			System.out.println("Nombres : "+ nombrea + " = " + nombreb);
		}
			
		else if(nombrea < nombreb)
		{
			System.out.println("Nombre " + nombrea +" < "+ nombreb);
		}
		
		else
		{
			System.out.println("Nombre " + nombreb +" < "+ nombrea);
		}
		
		sc.close();
	}

}
