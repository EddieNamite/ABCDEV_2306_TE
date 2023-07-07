package ABC_DEV_Jalon2MaCorrection;

import java.util.Scanner;

public class ABC_DEV_Jalon2MaCorrection {

	public static void main(String[] args) {

		String etudiant;
		boolean etude;
		String jour;
		boolean jourOuiNon;
	

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Etes vous etudiant ? \nOui= O ou o \tNon=N ou n ");
		etudiant = sc.next();
		
		if(etudiant.equals("O") || etudiant.equals("o"))
		{
			etude = true;
		}
		else
		{
			etude = false;
		}
		
		System.out.println("Quel jour de la semaine sommes nous ?");
		jour = sc.next();
		
		if(jour.equals("O") || jour.equals("o"))
		{
			jourOuiNon = true;
		}
		else
		{
			jourOuiNon = false;
		}
		
		
		
		}

	}

	// Vendredi 11h47, j'ai essayé de ma corriger en reprenant votre exemple (il fait plus de 25° et si il pleut et si ma copine veut sortir) : je pense être sur la bonne voie mais pas fini...