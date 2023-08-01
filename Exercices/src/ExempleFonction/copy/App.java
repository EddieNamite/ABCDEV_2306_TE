package ExempleFonction.copy;

public class App {

	public static int addition(int nombre1,int nombre2)
	{
		int resultat;

		resultat = nombre1 + nombre2;

		return resultat;
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
	}

}