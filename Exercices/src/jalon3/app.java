package jalon3;

/*
 * PSEUDO CODE
 * 
 * VARIABLES
 * nombre est un entier
 * reponse est une string
 * 
 * DEBUT DU PROGRAMME
 * 
 * Ecrire ("Saisir un nombre entre 1 et 10 :")
 * Lire <-- nombre
 * POUR( i=0 ; i<=10 ; i++)
 * Ecrire (i +" * "+ nombre +" = " i*nombre
 * 
 * 
 * 
 * FIN DU PROGRAMME
 */






import java.util.Scanner;

public class app {

	public static void main(String[] args) {

// Déclaration des variables
		
		int nombre;
		Scanner sc = new Scanner(System.in);
		
// Saisie de l'utilisateur
		
		System.out.println("Saisir un nombre entre 1 et 10");
		nombre = sc.nextInt();
		
		for(int i = 0; i <=10; i++)
		{
			System.out.println(i+" * "+nombre+" = "+ i * nombre);
		}
	
		System.out.println("Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)");
		
		
		// j'aurai pu faire la suite Adeline, j'en suis capable !! mais bon, le principale ( boucles ) est compris...
		
		sc.close();
	}

}
