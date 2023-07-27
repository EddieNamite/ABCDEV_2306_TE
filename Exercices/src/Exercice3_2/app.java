package Exercice3_2;

import java.util.Scanner;

public class app 
{

	public static void main(String[] args)
	{
				
		/*
		 VARIABLE
			Somme est un réel
			NbrMagasin est un entier
		DEBUT PROGRAMME
				
			NbrMagasin <-- 0
			ECRIRE "Saisissez la somme dont dispose Barnabé : "
			LIRE <-- Somme
			DEBUT SI Somme >= 1
				ALORS
				DEBUT TANT QUE Somme > 0
					DEBUT SI (Somme / 2) + 1 >= 0
					ALORS
						Somme <-- Somme - ((Somme / 2 ) + 1)
					SINON
						Somme <-- 0
					FIN SI
					NbrMagasin <-- NbrMagasin + 1
				FIN TANT QUE
			FIN SI
			ECRIRE "Barnabé est allé dans ", NbrMagasin, " magasin(s)."
		FIN PROGRAMME
		 */		
		
		Scanner sc = new Scanner(System.in);
		int nbrMagasin = 0;
		double somme;

		System.out.println("Saisissez la somme dont dispose Barnabe : ");
		somme = sc.nextDouble();
		if(somme >=1) {
			while (somme > 0) {
				if (somme - (somme / 2 + 1) >= 0) {
					somme -= (somme / 2) + 1;
				} else {
					somme = 0;
				}
				nbrMagasin ++;
			}
		}
		System.out.println("Barnabe est alle dans " + nbrMagasin + " magasin(s).");
		sc.close();	
		
		
		
		
		
		
	}

}
