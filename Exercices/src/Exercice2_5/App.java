package Exercice2_5;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int Nb;
		int boucl;
		System.out.println("Saisir un nombre :");
		Nb = sc.nextInt();
		System.out.println("Liste des diviseurs de " + Nb);
		
		for(boucl=2; boucl<=Nb-1; boucl++) {
		
			if(Nb % boucl == 0){
			
				System.out.println(" "+boucl);

			}
			
		}
	
		sc.close();
	}

}