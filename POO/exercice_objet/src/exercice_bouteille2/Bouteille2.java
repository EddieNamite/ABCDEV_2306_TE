package exercice_bouteille2;

public class Bouteille2 
{
	// Attributs
	
	private final double capaciteEnL;
	private final double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	// Constructeur par defaut
	
	public Bouteille2()
	{
		nom = "evian";
		contenanceEnL = 0.9;
		capaciteEnL = 1.5;
		estOuverte = true;
	}
	
	// Constructeur avec parametres
	
	public Bouteille2(String _nom, double _capaciteEnL, double _contenanceEnL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
	}
	
	public boolean ouvrir()
	{
		if(!this.estOuverte)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean fermer()
	{
		if(this.estOuverte)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remplirTout()
	{
		if(this.estOuverte)
		{
			if(this.contenanceEnL < this.capaciteEnL)
			{
				this.contenanceEnL = this.capaciteEnL;
						return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	

	
	
	
	
}
