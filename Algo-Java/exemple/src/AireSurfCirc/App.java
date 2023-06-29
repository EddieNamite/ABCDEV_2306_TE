package AireSurfCirc;

import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Déclaration des variables
		
		float rayon;
		float angle;
		double aire;
		Scanner sc;
		final double pi = Math.PI;
		sc = new Scanner(System.in);
		
		// Saisie du rayon
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextInt();
	
		// Saisie de l'angle
		
		System.out.println("Saisir l'angle");
		angle = sc.nextInt();
		
		// Calcul de l'aire
		
		aire = Math.round(pi * angle * Math.pow(rayon,2) * 100.0) / 100.0;
		
		System.out.println("L'aire est " + aire );
	
		sc.close();
	}

}

