package ExerciceFonction1;

import java.util.Scanner;

public class App {
	/*
	 PROCEDURE
	inversion(entier a, entier b)
	tmp est un entier
	tmp <-- a
	a <-- b
	b <-- tmp
	ecrire "Aprés inversion : nombre a = ",a," nombre b = ",b
FIN PROCEDURE
VARIABLES
	nombre1 est un entier
	nombre2 est un entier
DEBUT DU PROGRAMME
	Ecrire "saisir le 1er nombre"
	lire nombre1
	Ecrire "saisir le 2eme nombre"
	lire nombre2
	ecrire "Avant inversion : nombre a = ",nombre1," nombre b = ",nombre2
	inversion(nombre1,nombre2)
FIN DU PROGRAMME
	
	 */
	public static void inversion(int a,int b)
	{
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Aprés inversion : nombre a = "+a+" nombre b = "+b);
	}

	public static void main(String[] args) {
		
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		System.out.println("Avant inversion : nombre a = "+nombre1+" nombre b = "+nombre2);
		inversion(nombre1,nombre2);
		
		sc.close();
	}

}
