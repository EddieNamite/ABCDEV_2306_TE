package porteDeGarage;

public class App {

	public static void main(String[] args) {
		
		MaPorteDeGarage maPorte1 = new MaPorteDeGarage("Leroy Merlin", true, false,25,100,0);
		MaPorteDeGarage maPorte2 = new MaPorteDeGarage("Brico Depot", false,true,0,100,0);
		
		boolean test1 = maPorte1.ouvrir();
		boolean test2 = maPorte2.ouvrir();
		boolean test3 = maPorte1.fermer();
		boolean test4 = maPorte2.fermer();

	}

}