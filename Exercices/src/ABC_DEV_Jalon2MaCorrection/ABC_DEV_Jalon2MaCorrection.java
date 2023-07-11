package ABC_DEV_Jalon2MaCorrection;

import java.util.Scanner;

public class ABC_DEV_Jalon2MaCorrection {

	public static void main(String[] args) {

		String etudiant;
		boolean etude;
		int jour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Etes vous etudiant ? \nOui= O ou o \tNon=N ou n ");
		etudiant = sc.next();
		
		System.out.println("Quel jour de la semaine sommes nous (ex: 1 pour lundi, 2 pour mardi, etc...?");
		jour = sc.nextInt();
		
		if(etudiant.equals("O") || etudiant.equals("o"))
		{
			etude = true;
		}
		else
		{
			etude = false;		
		}
				
		if(jour == 3 && etude == true)
		{
			System.out.println("Vous avez une reduction de 50%");
		}
		else if(jour == 4 && etude == true)
		{
			System.out.println("Vous avez une reduction de 20%");
		}
		
		else
		
		{
			System.out.println("Vous n'avez aucune reduction");
		}
			
		sc.close();
		}
	}