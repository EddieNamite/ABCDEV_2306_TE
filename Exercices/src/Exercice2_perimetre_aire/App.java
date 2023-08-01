package Exercice2_perimetre_aire;

import java.util.Scanner;

public class App {
	/*
	 PROCEDURE 
	 	calculPerimetreAire(reel a, reel b, reel c)
	 	perimetre est reel
	 	aire est un reel
	 	perimetre <-- a+b+c
	 	aire <-- ((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c))^1/2
	 	ecrire "Avec la procedure : le perimetre est : ",perimetre," l'aire est : ",aire
	 Fin Procedure
	 FONCTION
	 	reel calculperimetre(reel a, reel b, reel c) 
	 	perimetre est reel
	 	perimetre <-- a+b+c
	 	retourne perimetre
	 fin fonction
	 FONCTION
	 	reel calculAire(reel a, reel b, reel c)  
	 	aire est un reel
	 	aire <-- ((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c))^1/2
	 	retourne aire
	 Fin fonction
	 Variables
	 a, b, c sont des reels
	 Debut du programme
	 Ecrire "saisir le coté a :
	 Lire a
	 Ecrire "saisir le coté b :
	 Lire b
	 Ecrire "saisir le coté c :
	 Lire c
	 calculPerimetreAire(a,b,c)
	 Ecrire "Avec la fonction: le perimetre est : ",calculPerimetre(a,b,c)," l'aire est : ",calculAire(a,b,c)
	 Fin de programme
	 
	 */

	// procedure
	public static void calculPerimetreAire(double a,double b,double c)
	{
		double perimetre,aire;
		perimetre = a+b+c;
		aire = Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)),1/2);
		System.out.println("Avec la procedure : le perimetre est : "+perimetre+" l'aire est : "+aire);
	}

	// fonction
	public static double calculPerimetre(double a,double b,double c)
	{
		double perimetre;
		perimetre = a+b+c;
		return perimetre;
	}
	public static double calculAire(double a, double b, double c)
	{
		double aire;
		double perimetre =calculPerimetre(a,b,c);
		aire = Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)),0.5);
		return aire;
	}

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le coté a :");
		a = sc.nextDouble();
		System.out.println("Saisir le coté b :");
		b = sc.nextDouble();
		System.out.println("Saisir le coté c :");
		c = sc.nextDouble();
		calculPerimetreAire(a,b,c);
		System.out.println("Avec la fonction: le perimetre est : "+calculPerimetre(a,b,c)+" l'aire est : "+calculAire(a,b,c));
		sc.close();
	}

}