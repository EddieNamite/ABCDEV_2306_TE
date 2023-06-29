package AireVolume;

import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Déclaration des variables
		
		float rayon;
		double aire;
		double volume;
		Scanner sc;
		final double pi = Math.PI;
		sc = new Scanner(System.in);
		
		// Saisie du rayon
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextInt();
	
		// Calcul de l'aire et du volume
		
		aire = Math.round(4 * pi * Math.pow(rayon,2) * 100.0) / 100.0;
		volume = Math.round(4/3d * pi * Math.pow(rayon,3) * 100.0) / 100.0;
	
		System.out.println("L'aire est " + aire + " et le volume est " + volume);
	
		sc.close();
	}

}