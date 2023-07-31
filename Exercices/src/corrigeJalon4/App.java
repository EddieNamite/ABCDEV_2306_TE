package corrigeJalon4;

import java.util.Scanner;

public class App {
	/*
	 Variables
@@ -26,16 +28,63 @@ public class App {
		position <-- position + 1
	FIN TANT QUE
SINON
	N <-- 2
	nb <-- 2
FIN SI
Écrire "Les ", nb, " premiers nombres de la suite de Fibonacci sont \n", resultat
FIN PROGRAMME
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration des variables 

		int position,nb;
		String resultat;
		long nbPrecedent,nbCourant,nbSuivant;
		boolean fermeture_prog = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("\t[La suite de Fibonacci]");
		do
		{
			System.out.println("\tCombien de nombres de la suite de fibonacci souhaitez vous affiché : ");
			nb = sc.nextInt();

			//initialisation des variables
			position = 2;
			resultat =  "\t0\n\t1";
			nbPrecedent = 0;
			nbCourant = 1;

			if(nb == 0)
			{
				fermeture_prog = true;
			}
			else
			{
				if(nb > 2)
				{
					while(position < nb)
					{
						nbSuivant = nbPrecedent + nbCourant;
						resultat = resultat+ "\n\t"+  nbSuivant;
						nbPrecedent = nbCourant;
						nbCourant = nbSuivant;
						position = position + 1;
					}
				}
				else 
				{
					nb = 2;
				}

				System.out.println("\tLes "+ nb+ " premiers nombres de la suite de Fibonacci sont \n"+ resultat);
				System.out.println("\t"+nb+" nombres affiché\n");
			}

		}while(!fermeture_prog);

		sc.close();
	}

}