package Exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Déclaration des variables
		double nombrea;
		double nombreb;
		double nombrec;
		
		Scanner sc = new Scanner(System.in);
		
		// Saisie des nombres
		System.out.println("Saisir le 1er nombre ");
		nombrea = sc.nextDouble();
		
		System.out.println("Saisir le 2ième nombre ");
		nombreb = sc.nextDouble();
		
		System.out.println("Saisir le 3ième nombre ");
		nombrec = sc.nextDouble();
				
		// Calcul du tri et affichage de la comparaison
		
		if(nombrec < nombreb && nombrec < nombrea)
		{
			if(nombrea < nombreb)
			{
				System.out.println("Nombres organisés : "+ nombrec +" "+ nombrea +" "+nombreb);
			}
			else
			{
				System.out.println("Nombres organisés : "+ nombrec +" "+nombreb +" "+nombrea);	
			}		
		}
		else if(nombrea < nombreb)	
		{
			if(nombreb < nombrec) {
			System.out.println("Nombres organisés : "+ nombrea +" "+ nombreb +" "+ nombrec);
			
			}
			else
			{
				System.out.println("Nombres organisés : "+ nombrea +" "+ nombrec +" "+ nombreb);
			}
			
		}else {
			if(nombrea < nombrec)
			{
				System.out.println("Nombres organisés : "+ nombreb +" "+ nombrea +" "+ nombrec);
			}
		
			else
			{
				System.out.println("Nombres organisés : "+ nombreb +" "+ nombrec +" "+ nombrea);
			}

		}		
		
		sc.close();
	}

}
