package Exemple_tableau;

import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		// declaration d'un tableau de chaine de caractère contenant 3 elément
		String[] tabPrenom = new String[3];
		// declaration d'un tableau d'entier contenant 5 elements
		int[] tabNombre = new int[5];
		
		// ecrire dans un tableau en spécifiant l'index
		tabPrenom[0] = "Adeline";
		tabPrenom[1] = "David";
		tabPrenom[2] = "Alex";
		// afficher l'element se trouvant à l'indice 0
		System.out.println(tabPrenom[0]);
		
		// declaration et initialisation d'un tableau contenant 4 element 
		String tabPrenom2[] = {"Jean","Pierre","Jacques", "Martin"};
		
		// ecriture dans un tableau 
		for(int i = 0; i <= tabNombre.length-1;i++)
		{
			System.out.println("Saisir un nombre entier :");
			tabNombre[i] = sc.nextInt();
		}
		
		// affichage de tout les element du tableau de l'indice 0 à l'indice max (la longueur du tableau-1)
		for(int j = 0; j <= tabNombre.length-1;j++)
		{
			System.out.print(tabNombre[j]+ " ");
		}
		
		System.out.println("\n");
		
		// affichage de tout les elements du tableau de l'indice max (la taille du tableau-1) à l'indice 0
		for(int k = tabNombre.length-1; k>=0;k--)
		{
			System.out.print(tabNombre[k]+ " ");
		}
		sc.close();
	}

}
