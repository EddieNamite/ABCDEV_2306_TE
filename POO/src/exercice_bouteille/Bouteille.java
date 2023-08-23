package exercice_bouteille;

public class Bouteille {

	// attributs
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;

	//  constructeur par defaut

	public Bouteille()
	{
		nom = " ";
		contenanceEnL = 0.9;
		capaciteEnL = 1;
		estOuverte = true;
	}

	// constructeur avec parametre

	public Bouteille(String _nom, double _contenanceEnL, double _capaciteEnL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.contenanceEnL = _contenanceEnL;
		this.capaciteEnL = _capaciteEnL;
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

}