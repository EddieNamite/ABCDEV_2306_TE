package MaSoupeLiebig;

public class Soupe 
{

	// Attributs
	
	private String marque;
	private int capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private double quantiteEnL;
	private Ingredients ingredients;
	
	// Constructeur par defaut
	
	public Soupe()
	{
		marque ="Liebig";
		capaciteEnL = 1;
		contenanceEnL = 0.75;
		estOuverte = true;
		ingredients.setLegumes("Patates");
		ingredients.condiments = "Sel";
	}
	
	// Constructeur avec parametres
	
	public Soupe(String _marque, int _capaciteEnL, double _contenanceEnL, boolean _estOuverte)
	{
		this.marque = _marque;
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
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	
	public boolean viderTout()
	{
		if(this.estOuverte)
		{
			if(this.contenanceEnL <= this.capaciteEnL)
			{
				this.contenanceEnL = 0;
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
	
	public boolean vider(double quantiteEnL)
	{
		if(this.estOuverte)
		{
			if(this.capaciteEnL >= this.contenanceEnL && this.contenanceEnL > 0)
			{
				
				this.contenanceEnL = this.contenanceEnL - this.quantiteEnL;
				
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
	public Ingredients getIngredients()
	{
		return ingredients;
	}
	
}
