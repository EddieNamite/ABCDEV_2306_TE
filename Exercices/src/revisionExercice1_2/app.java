package revisionExercice1_2;

import java.util.Scanner;

/*
 * PSEUDO CODE
 *  variables
 *   aire est un reel double
 *   volume est un reel double
 *   rayon est un reel double
 *   Pi = Math.Pi
 * DEBUT DU PROGRAMME
 * 	ecrire "Saisir le rayon"
 * 	lire <-- rayon
 * 		aire = 4 * Pi * rayon^2
 * 		volume = 4/3 * Pi * rayon^3
 *  ecrire " L'aire est egal à : "+ aire
 *  ecrire " Le volume est egal à "+ volume
 * FIN DU PROGRAMME
 *  
 */


public class app 
{

	public static void main(String[] args) 
	{

	
	Double aire;	
	Double volume;	
	Double rayon;
	final double pi = Math.PI;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Saisir le rayon :");
	rayon = sc.nextDouble();
	
	aire = 4 * pi * Math.pow(rayon,2);
	volume = 4/3d * pi * Math.pow(rayon,3);
	
	System.out.println("L'aire est egale a : "+ aire);
	System.out.println("Le volume est egal a : "+ volume);
	
	sc.close();
	
	}

}
