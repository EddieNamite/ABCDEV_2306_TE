package ExempleFonction;

public class App {

	public static int addition(int nombre1,int nombre2)
	{
		int resultat;

		resultat = nombre1 + nombre2;

		return resultat;
	}
	
	public static boolean estPlusgrand(int resultat)
	{
		boolean plusGrand;
		if(resultat > 10)
		{
			plusGrand = true;
		}
		else
		{
			plusGrand = false;
		}
		
		return plusGrand;
	}

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int calcul;
		int c = 7;
		int d = 10;

		calcul = addition(a,b);

		System.out.println(calcul);

		calcul = addition(c,d);

		System.out.println(calcul);
		
		calcul = addition(a,d);
		
		System.out.println(calcul +" "+estPlusgrand(calcul));
	}

}