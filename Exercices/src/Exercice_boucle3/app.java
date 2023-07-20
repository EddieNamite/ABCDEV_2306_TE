package Exercice_boucle3;

import java.util.Scanner;

/* PSEUDO CODE  Exercice 3 boucle WHILE
 * 
 * Variables
 * 		nombre est un entier
 * 		i est un entier à zero
 * Debut du programme
 * 		Ecrire" Saisir un nombre de départ"
 * 		Lire <-- nombre
 * Debut TANT QUE
 * 		tant que i est inférieur à 10
 * 		nombre égal nombre + 1
 * 		Ecrire nombre
 * 		i++
 * Fin TANT QUE
 * Fin du programme
 */


public class app {

	public static void main(String[] args) {
		
// declaration des variables
	int nombre = 0;
	
	int i=0;

	Scanner sc = new Scanner(System.in);

// Saisie du nombre
	System.out.println("Saisir un nombre de depart :");
	nombre = sc.nextInt();
	
// Boucle	
	while(i<10)
	{
		nombre +=1;
		System.out.print(nombre+" ");
		i++;
	}
		
	sc.close();

	}

}
