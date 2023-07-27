package jalon4exercice;

import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		
		int nb = 0;

		Scanner sc = new Scanner(System.in);

			System.out.println("[Suite de Fibonacci]");

			do { 
				System.out.println("\nCombien de nombres souhaitez-vous afficher : "); 
				
				System.out.println("0 pour quitter le programme");
				nb = sc.nextInt();
				
				if(nb != 0) 
				{

					System.out.println("Les " + nb + " premiers nombres de la suite de Fibonacci sont\n");

					if(nb < 2) 
					{  
						nb = 2;
					}

					int[]suite = new int[nb]; 

					for(int i = 0 ; i < suite.length; i++) 
					{ 
						if(i < 2) 
						{
							suite[i] = i;
						}else {
							suite[i] += suite[i-1] + suite[i-2];
						}
						System.out.println("	" +suite[i]);
					}

					System.out.println("\n" + nb + " nombres affichés");
				}else {
					System.out.println("Fin du programme");
				}
			}while(nb !=0);

		sc.close();

	}

}