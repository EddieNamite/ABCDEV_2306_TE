package exercice_bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille cristaline = new Bouteille("Cristaline",1.25,1.5,true);
		
		boolean test1 = cristaline.fermer();
		boolean test2 = cristaline.ouvrir();
		boolean test6 = cristaline.remplir(0.5);
		boolean test7 = cristaline.vider(0.25);
		boolean test8 = cristaline.vider(1.5);
		boolean test4 = cristaline.remplir(1);
		boolean test3 = cristaline.fermer();
		boolean test5 = cristaline.remplir(1.5);
		boolean test9 = cristaline.vider(0.5);
		
	}

}