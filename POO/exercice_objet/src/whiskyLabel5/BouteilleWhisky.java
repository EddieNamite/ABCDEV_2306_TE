package whiskyLabel5;

public class BouteilleWhisky 
{

	// Attributs
	
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String marque;
	
	// Constructeur par défaut
	
	public BouteilleWhisky()
	
	{
		marque = "Label5";
		capaciteEnL = 0.70;
		contenanceEnL = 0.50;
		boolean estOuverte = true;
	}
	
	// Constructeur avec parametres
	
	public BouteilleWhisky(String _marque, double _capaciteEnL, double _contenanceEnL, boolean _estOuverte)
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
		
	public boolean remplir(double QuantiteEnL)
	{
		if(this.estOuverte)
		{
			if(this.capaciteEnL > this.contenanceEnL +  QuantiteEnL)
			{
				this.contenanceEnL = this.contenanceEnL + QuantiteEnL;
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

	public boolean viderTout()
	{
		if(this.estOuverte)
		{
			if(this.contenanceEnL > 0)
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
	
	
	
	
	
	

}
