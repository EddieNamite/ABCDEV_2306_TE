package Exercice_fonction_annee_bissextile;

import java.util.Scanner;

public class App {
	/*
FONCTION Booleen anneeBisextille(entier annee)
@@ -29,9 +31,42 @@ Si anneeBisextille(annee)
Fin du programme
	 */

	public static boolean anneeBissextile(int annee) 
	{
		boolean estBissextile;

		if ((annee %4) == 0 && (annee %100) != 0 || (annee %400) == 0) 
		{
			estBissextile = true;
		}

		else 
		{
			estBissextile = false;
		}

		return estBissextile;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int annee;

		System.out.println("Saisir une annee");
		annee = sc.nextInt();

		if (anneeBissextile(annee)) 
		{
			System.out.println("L'année est bissextile");
		}

		else 
		{
			System.out.println("L'année n'est pas bissextile");
		}

		sc.close();
	}

}
