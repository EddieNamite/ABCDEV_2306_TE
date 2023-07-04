package Exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Déclaration des variables
		int nombrea;
		int nombreb;
		
		Scanner sc = new Scanner(System.in);
		
		// Saisie des nombres
		System.out.println("Saisir le 1er nombre ");
		nombrea = sc.nextInt();
		
		System.out.println("Saisir le 2ième nombre ");
		nombreb = sc.nextInt();
		
		// Calcul du tri
		
		if(nombrea == nombreb)
		{
			System.out.println("Nombres : "+ nombrea + " = " + nombreb);
		}
			
		else if(nombrea < nombreb)
		{
			System.out.println("Nombre " + nombrea);
			System.out.println("Nombre " + nombreb);
		}
		
		else
		{
			System.out.println("Nombre " + nombreb);
			System.out.println("Nombre " + nombrea);
		}
		
		sc.close();
	}

}
