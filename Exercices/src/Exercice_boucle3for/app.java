package Exercice_boucle3for;

import java.util.Scanner;


/*
 *PSEUDO CODE Exercice 3 boucle FOR
 * 
 *Variables
 * 		VARIABLES
 *	nombre est un entier
 *	i est un entier
 *Debut Programme
 *	Ecrire "Saisissez un nombre"
 *	Lire <-- nombre
 *	i <-- nombre + 1
 *
 *Boucle tant que
 *Debut Programme
 *  Debut Tant que
 *       Tant que counter <= nombre + 10
 *       Faire
 *           Ecrire counter
 *           counter++
 *  Fin Tant que
 *Fin Programme
 *
 * 
 * 		
*/


public class app 
{

	public static void main(String[] args) 
	{
		
// declaration des variables
		int nombre = 0;
		
		Scanner sc = new Scanner(System.in);
	
// Saisie du nombre
		System.out.println("Saisir un nombre de depart :");
		nombre = sc.nextInt();		
		
		
// Boucle for	
		for (int i=0; i < 10; i++)
		{
			nombre++;
			System.out.println(nombre);
			
		}
			
		sc.close();

	}

}
