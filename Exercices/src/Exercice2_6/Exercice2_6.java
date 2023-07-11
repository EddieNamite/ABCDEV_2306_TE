package Exercice2_6;

import java.util.Scanner;

/*
 * Variables
 * 		nombre est un entier
 * 		i est un entier
 * 		est_premier est un booleen
 * Debut du programme
 * 		est_premier <-- vrai
 * 		ecrire "Saisir un nombre"
 * 		lire nombre
 * 		Debut boucle pour
 * 		Pour i allant de 2 à nombre - 1
 * 		Debut Si
 * 			Si nombre%i = 0
 * 			Alors 
 * 			est_premier <-- faux
 * 			Fin Si
 * 		Fin Pour
 * 		
 * Debut Si
 * 		Si est_premier = vrai
 * 		Alors ecrire " nombre ",nombre" est un nombre premier"
 * 		Sinon ecrire " nombre ",nombre" n'est pas un nombre premier"
 * Fin Si
 * Fin du programme
 */


public class Exercice2_6 
{

	public static void main(String[] args) 
	{
		int nombre;
		int i;
		boolean est_premier;	
		est_premier = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre :");
		nombre = sc.nextInt();
		
		nombre = Math.abs(nombre); // valeur absolue d'un nombre
		
		if(nombre == 0 || nombre == 1) est_premier = false;
		for(i = 2; i<nombre; i++) 
		{			
			if(nombre%i == 0) 
			{
				est_premier = false;
			}
		}
		
		if(est_premier)
		{
			System.out.println(nombre+" est premier");
		}
		else
		{
			System.out.println(nombre+" n'est pas premier");
		}	
		
		sc.close();
	}

}
