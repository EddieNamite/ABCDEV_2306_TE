package Exercices_conditions1;

import java.util.Scanner;

public class algoConditions1 {

	public static void main(String[] args) {
	

/*
 * VARIABLES
A est un entier

DEBUT DU PROGRAMME
Ecrire "Saisir un nombre"
Lire <-- nombre a

DEBUT Si
	Si nombre < 0
	Ecrire "Nombre négatif"
	SINON Si nombre > 0
	Ecrire "Nombre positif"
FIN Si
FIN DU PROGRAMME
 */
	
// Déclaration des variables
		
	int a;
	Scanner sc = new Scanner(System.in);
	
// Saisie du nombre
		
	System.out.println("Saisissez un nombre :");
	a = sc.nextInt();
	
// Conditions
	
	if(a < 0)
	{
		System.out.println("Nombre negatif");
	}
	
	
	else if(a > 0)
	{
		System.out.println("Nombre positif");
	}
		
	sc.close();
	
	}

}
