package Exercice2_5;

import java.util.Scanner;


public class App 
{

	public static void main(String[] args) 
	{

Scanner sc = new Scanner(System.in);
		
		int Nb;
		int boucle;
		System.out.println("Saisir un nombre :");
		Nb = sc.nextInt();
		System.out.println("Liste des diviseurs de " + Nb);
		
		for(boucle=2; boucle<=Nb-1; boucle++) 
		{
		
			if(Nb % boucle == 0)
			{
			
				System.out.println(" "+boucle);
			}
		}
		
		sc.close();
	}

}