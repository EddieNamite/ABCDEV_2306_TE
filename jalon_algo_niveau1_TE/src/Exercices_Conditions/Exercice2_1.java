package Exercices_Conditions;

import java.util.Scanner;

public class Exercice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * VARIABLES
		 * Debut du programme
		 * 		Ecrire"Saisir votre age"
		 * 		Lire <-- age
		 * Debut Si
		 * Si
		 * 		a<1
		 * Alors
		 * 		Ecrire"Vous n'etes pas encore ne"
		 * Sinon Si
		 * 		a<18
		 * Alors
		 * 		Ecrire"Vous etes mineur"
		 * Sinon
		 * 		Ecrire"Vous etes majeur"
		 * Fin Si
		 * Fin du programme
		 */	
		
		
	//Déclaration des variables
		int age;
		Scanner sc = new Scanner(System.in);
	//Saisie de l'age
		System.out.println("Saisir votre age :");
		age = sc.nextInt();
	//Réponse de l'ordinateur
		if(age<1)
		{
			System.out.println("Vous n'etes pas encore ne");
		}
		else if(age<18)
		{	
			System.out.println("Vous etes mineur");
		}
		else
		{
			System.out.println("Vous etes majeur");
		}
	
	}






}
