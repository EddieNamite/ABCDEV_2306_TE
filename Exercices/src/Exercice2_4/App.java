package Exercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisir l'annee A :");
		A = scan.nextInt();
		
		if(((A % 4 == 0) && (A % 100 != 0)) || (A % 400 == 0)) {
			System.out.println("L'annee " + A + " est bissextile");
		}
		
		else {
			System.out.println("L'annee " + A + " n'est pas bissextile");
		}
		
		scan.close();
	}

}