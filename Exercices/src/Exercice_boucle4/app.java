package Exercice_boucle4;

import java.util.Scanner;

/*
 *PSEUDO CODE Exercice 4 boucle FOR
 * 
 *Variables
 * 		VARIABLES
 *nombre est un entier
 *nombrePlus un entier
 *Debut Programme
 *Ecrire "Saisissez un nombre"
 *Lire <-- nombre
 *
 *  Debut POUR
 *     POUR ( int i = 0 ;  i <= nombre ; i++      
 *        nombrePlus++
 *  Fin FOR
 *
 *Ecrire " La somme des entiers jusque "+nombre+" donne :"+nombrePlus
 *Fin Programme
 *
 * 		
*/


public class app 
{

	public static void main(String[] args) 
	{
		
		int nombre = 0;
		int nombrePlus = 0;

		Scanner sc = new Scanner(System.in);
			System.out.println("Saisissez un nombre, je calcule la somme des entiers jusqu'à ce nombre :");
			nombre = sc.nextInt();
			
			for(int i = 0; i <= nombre; i++) 
			{
				nombrePlus +=i;
			}
			
			System.out.println("La somme des entiers jusque : " + nombre + " donne : " + nombrePlus);
		
		sc.close();	
	}
}
