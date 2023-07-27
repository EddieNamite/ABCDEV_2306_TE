package ExerciceTableau3;

/*
 * PSAUDO CODE
 * 
 * VARIABLES
    length est un entier
    numberArray[n] est un tableau d'entiers
    i est un entier
    posCount est un entier
    negCount est un entier
    zero est un entier
    count est un entier
Debut Programme
    Ecrire "Saisissez la taille du tableau"
    Lire <-- length
    n <-- length
    Debut Pour
        pour i allant de 0 à length
        Faire
            Ecrire "entrez la valeur", count
            lire <-- numberArray[i]
            Debut Si
                Si numberArray[i] est supérieur à 0
                    Alors posCount++
                Sinon Si numberArray[i] est inférieur à 0
                    Alors negCount++
                Sinon
                    zero++
            Fin Si
            count++
    Fin pour
    Ecrire "nombre(s) positif(s) : ", posCount, ", nombre(s) négatif(s) : ",negCount, " et ",zero," zero(s)"
Fin Programme
 * 
 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	// Declaration des variables
		
		int length; 
		int counter = 1;
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		
	// Saisie taille du tableau			
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Saisissez la taille du tableau : ");
			length = sc.nextInt();
			
			int[] numberArray = new int[length];
			
			
	// Boucle for
			
			for(int i = 0 ; i < numberArray.length ; i++) {
				System.out.println("Entrez la valeur numéro " + counter);
				numberArray[i] = sc.nextInt();
				if(numberArray[i] > 0) {
					posCount++;
				}else if(numberArray[i] < 0) {
					negCount++;
				}else {
					zeroCount++;
				}
				counter++;
			}
			
			System.out.println("Il y a dans le tableau " + posCount + " valeur(s) positives, " 
								+ negCount + " valeur(s) nagatives et " 
								+zeroCount + " fois zero");
		sc.close();

	}

}