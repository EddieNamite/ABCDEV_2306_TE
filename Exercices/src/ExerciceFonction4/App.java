package ExerciceFonction4;

/*
 * PSEUDO CODE
 * 
 * FONCTION an est un entier, anneebissextile est un boolean
 * 			estbissextile est un entier
 * 
 * 
 */






import java.util.Scanner;

public class App {

	public static boolean anneebissextile(int an)
	{
			
		boolean estbissextile;
		
		if(((an % 4 == 0) && (an % 100 != 0)) || (an % 400 == 0)) 
		{
			estbissextile = true;
		}
		else
		{
			estbissextile = false;
		}
		
		return estbissextile;
	}
	
	public static void main(String[] args)
	{

		int an;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisir l'annee A :");
		an = scan.nextInt();
		
		if(anneebissextile(an))
		{
			System.out.println("L'annee " + an + " est bissextile");
		}
		else {
			System.out.println("L'annee " + an + " n'est pas bissextile");
		}
		
		scan.close();
	}

}