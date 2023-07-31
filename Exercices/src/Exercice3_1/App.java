package Exercice3_1;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Déclaration des variables
		
				int nombre;
				int sup;
				int essai;
				int min;
				int max;
				boolean win;
			
				Scanner scanner = new Scanner(System.in);
				Random random = new Random();
				
				nombre = random.nextInt(100)+1;
				
				essai = 0 ;
				win = false;
				min = 0;
				max = 100;
				
				System.out.println("Saisir un nombre entier entre 0 et 100"); 
				
				do {
							
					sup = scanner.nextInt();

					if (nombre != sup)  {			
						
						if (sup > nombre) {
							System.out.println("Entrer un nombre compris entre : "+sup+" et "+min);
							max = sup;
										}
						else {
							System.out.println("Entrer un nombre compris entre : "+max+" et "+sup);
							min = sup;
							}		
						}
					
						if (nombre == sup) {
							win = true;}			
						
						essai = essai+1; 
								
					}while (win != true);
						
					System.out.println(" Bravo ! reussi en "+essai+" essais");

				scanner.close();
				
				}

	}


