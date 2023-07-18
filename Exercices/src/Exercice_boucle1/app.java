package Exercice_boucle1;

/*
 * Variables
 * 		nombre est un entier
 * Debut du programme
 * nombre <-- 0
 * Debut tant que
 * 		tant que nombre < 1 OU nombre > 3
 * 		faire
 * 			Ecrire "Ecrire un nombre entre 1 et 3 :"
 * 			Lire nombre
 * Fin tant que
 * Fin du programme
 */

import java.util.Scanner;

public class app 
{

	public static void main(String[] args) 
	{
		
		
// Déclaration des variables
	
		int nombre=0;
		Scanner sc = new Scanner(System.in);
		
// Saisie du nombre
		
		while(nombre <1 || nombre > 3)
		{
			System.out.println("Saisissez un nombre entre 1 et 3");
			nombre = sc.nextInt();
		}
		
		sc.close();
		
	System.out.println("Votre nombre convient");
	
	}

}
