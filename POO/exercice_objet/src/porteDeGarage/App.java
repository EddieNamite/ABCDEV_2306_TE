package porteDeGarage;

public class App {

	public static void main(String[] args) {
		MaPorteDeGarage maPorte = new MaPorteDeGarage(true, true, 0); 
		
		boolean test1 = maPorte.deverrouillerPorte();
		boolean test2 = maPorte.ouvrir(50);
		boolean test3 = maPorte.fermer(60);
		boolean test4 = maPorte.ouvrirEntierement();
		boolean test7 = maPorte.ouvrirEntierement(); // false : deja ouverte complète
		boolean test5 = maPorte.fermerEntierement();
		boolean test6 = maPorte.verrouillerPorte();

	}

}