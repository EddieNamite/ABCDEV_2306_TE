package ExerciceTableau1;

public class app 
{

/*
 * VARIABLES
 * 	tabl1[] est un tableau d'entier
 * 	i est un entier
 * DEBUT DU PROGRAMME
 * 	debut pour
 * 		pour i allant de 0 à 6
 * 		tab1[i] <-- 0
 * 		i suivant
 * 	fin pour
 * FIN DU PROGRAMME	
 */
	
	
	public static void main(String[] args) 
	{

	int tab1[] = new int[7];
		
		for (int i=0; i< tab1.length ; i++)
	{
		tab1[i] = 0;
		System.out.print(tab1[i] +" ");
	}

	}
}