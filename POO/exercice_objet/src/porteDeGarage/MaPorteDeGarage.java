package porteDeGarage;

public class MaPorteDeGarage {
	boolean verrouillee;
	boolean estFermee;
	int niveauOuverture;
	final int niveauMin = 0;
	final int niveauMax = 100;
	boolean verified;
	
	
	// Constructeur par défaut
	
	public MaPorteDeGarage() {
		verrouillee = true;
		estFermee = true;
		niveauOuverture = 0;
		verified = true;
	}
	
	// Constructeur avec parametres
	
	public MaPorteDeGarage(boolean _verrouillee, boolean _estFermee, int _niveauOuverture) {
		this.verrouillee = _verrouillee;
		this.estFermee = _estFermee;
		this.niveauOuverture = _niveauOuverture;
		
		if((this.verrouillee && this.estFermee && this.niveauOuverture ==0) ^ this.niveauOuverture != 0) {
			verified = true;
		}else {
			verified = false;
		}
	}
	
	public boolean verrouillerPorte() {
		if(verified && this.estFermee && !this.verrouillee) {
			this.verrouillee = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deverrouillerPorte() {
		if(verified && this.verrouillee) {
			this.verrouillee = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean fermer(int _angle) {
		if(verified && !this.estFermee && this.niveauOuverture - _angle >= this.niveauMin) {
			this.niveauOuverture -= _angle;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean ouvrir(int _angle) {
		if(verified && !this.verrouillee && _angle <= (this.niveauMax - this.niveauOuverture)) {
			this.estFermee = false;
			this.niveauOuverture += _angle;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean ouvrirEntierement() {
		if(verified && !this.verrouillee && this.niveauOuverture != this.niveauMax) {
			this.estFermee = false;
			this.niveauOuverture = 100;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean fermerEntierement() {
		if(verified && !this.estFermee) {
			this.estFermee = true;
			this.niveauOuverture = 0;
			return true;
		}else {
			return false;
		}
	}
}