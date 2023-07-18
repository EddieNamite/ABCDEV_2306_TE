package Exercice_boucle2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {

	
		/*
		 * Variables
		 * 		nombre est un entier
		 * Debut du programme
		 * nombre <-- 0
		 * Debut tant que
		 * 		tant que nombre < 10 OU nombre > 20
		 * 		faire
		 * 			Ecrire "Ecrire un nombre entre 1 et 3 :"
		 * 			Lire nombre
		 * 			Debut Si
		 * 				si nombre < 10
		 * 				Alors ecrire " plus grand !"
		 * 				si nombre > 20
		 * 				Alors ecrire " plus petit !"
		 * 				sinon ecrire " nombre convient "
		 *  		Fin Si
		 * Fin tant que
		 * Fin du programme
		 */
				
				
		// Déclaration des variables
			
				int nombre=0;
				Scanner sc = new Scanner(System.in);
				
		// Saisie du nombre
				
				while(nombre <10 || nombre > 20)
			{
					System.out.println("Saisissez un nombre entre 10 et 20");
					nombre = sc.nextInt();
				if(nombre < 10)
				{
					System.out.println("Plus grand");
				}
				else if(nombre > 20)
				{
					System.out.println("Plus petit");
				}
				else
				
					System.out.println("Nombre valide");
				
			}
				sc.close();
	}

}
