package exemple_objets_ville;

public class Ville {
	
	private String nomVille;
	private int nbHabitants;
	private String nomPays;
	private char categories;
	// variable publique qui compte les instances
	public static int nbInstances = 0;
	// variable privee qui compte les instances
	private static int nbInstancesBis = 0;
	
	// Constructeur par defaut
	public Ville()
	{
		System.out.println("Creation d'un objet ville avec le constructeur par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}
	// Constructeur avec parametre
	public Ville(String pNomVille, int pNbre, String pNomPays)
	{
		System.out.println("Creation d'un objet ville avec le constructeur avec paramétre");
		nomVille = pNomVille;
		nomPays = pNomPays;
		nbHabitants = pNbre;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}
	
	/**********************
	 **** Getters *********
	 **********************/
	
	// retourne le nom de la ville
	public String getNomVille()
	{
		return this.nomVille;
	}
	// retourne le nom du pays
	public String getNomPays()
	{
		return nomPays;
	}
	// retourne le nombre d'habitant
	public int getNbHabitants()
	{
		return nbHabitants;
	}
	
	public char getCategorie()
	{
		return this.categories;
	}
	
	public static int getNbInstances()
	{
		return nbInstancesBis;
	}
	
	/**********************
	 *****Setters********** 
	 **********************/
	public void setNomVille(String pNomVille)
	{
		nomVille = pNomVille;
	}
	
	public void setNomPays(String pNomPays)
	{
		nomPays = pNomPays;
	}
	
	public void setNbHabitants(int pNbHabitants)
	{
		nbHabitants = pNbHabitants;
		this.setCategorie();
	}
	
	private void setCategorie()
	{
		int bornesSuperieurs[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories [] = {'?','A','B','C','D','E','F','G','H'};
		
		int i = 0;
		
		while(i < bornesSuperieurs.length && this.nbHabitants > bornesSuperieurs[i])
		{
			i++;
		}
		this.categories = categories[i];
	}
	
	public String decrisToi()
	{
		return "\n ville = "+this.getNomVille()+" ville de "+this.getNbHabitants()
		+" habitants se situant en "+this.getNomPays()
		+" et est de categorie : "+this.getCategorie();
	}
	
	public String comparerVille(Ville uneVille)
	{
		String str;
		
		if(uneVille.getNbHabitants() > this.nbHabitants)
		{
			str = uneVille.getNomVille()+" est plus peuplee que "+this.nomVille;
		}
		else
		{
			str = this.nomVille+" est plus peuplee que "+uneVille.getNomVille();
		}
		return str;
	}
}
