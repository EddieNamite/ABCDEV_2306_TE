package Poupee_russe;

public class PoupeeRusse {
	
	private int taille;
	private boolean estOuverte;
	private boolean contientPoupee;
	private boolean estContenueDansPoupee;
	
	public PoupeeRusse(int _taille, boolean _estOuverte, boolean _contientPoupee, boolean _estContenueDansPoupee)
	{
		this.taille = _taille;
		this.estOuverte = _estOuverte;
		this.contientPoupee = _contientPoupee;
		this.estContenueDansPoupee = _estContenueDansPoupee;
	}
	
	public boolean ouvrir()
	{
		if(!this.estOuverte && !this.estContenueDansPoupee)
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
		if(this.estOuverte && !this.estContenueDansPoupee)
		{
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean placerDans(PoupeeRusse p)
	{
		if(!this.estOuverte && !this.estContenueDansPoupee)
		{
			if(p.estOuverte && !p.contientPoupee)
			{
				if(p.taille > this.taille)
				{
					this.estContenueDansPoupee = true;
					p.contientPoupee = true;
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
		else
		{
			return false;
		}
	}
	
	public boolean sortir(PoupeeRusse p)
	{
		if(p.estOuverte && this.estContenueDansPoupee)
		{
			p.contientPoupee = false;
			this.estContenueDansPoupee = false;
			return true;
		}
		else
		{
			return false;
		}
	}

}
