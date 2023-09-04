package porteDeGarage;

public class MaPorteDeGarage {
	private final String marque;
	private boolean estOuverte;
	private boolean estVerouiller;
	private int degresOuverture;
	private final int degresMax;
	private final int degresMin;

	public MaPorteDeGarage(String _marque, boolean _estOuverte, boolean _estVerouiller, int _degresOuverture, int _degresMax,int _degresMin)
	{
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.estVerouiller = _estVerouiller;
		this.degresOuverture = _degresOuverture;
		this.degresMax = _degresMax;
		this.degresMin = _degresMin;
	}

	public boolean ouvrir()
	{
		if(!this.estOuverte && !this.estVerouiller)
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
		if(this.estOuverte && !this.estVerouiller)
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