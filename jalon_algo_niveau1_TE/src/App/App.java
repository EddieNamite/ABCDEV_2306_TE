package App;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	double Somme;
	double Interet;
	int Annees;
	double ISimple;
	double IComposer;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Saisir la somme :");
	Somme = sc.nextDouble();
	
	System.out.println("Saisir l'interet :");
	Interet = sc.nextDouble();	
		
	System.out.println("Saisir la nombre d'annees :");
	Annees = sc.nextInt();	
		
	ISimple = (Somme*(1+Annees*Interet/100d));
	IComposer = Somme*Math.pow((1+Interet/100d),Annees);
		
	System.out.println("L'interet simple vaut " + ISimple + "et l'interet compose vaut " + IComposer);
	
	sc.close();
		
		
	}
}