package Poupee_russe;

public class App {

	public static void main(String[] args) {
		
		PoupeeRusse poupee1 = new PoupeeRusse(2,false,false,false);
		PoupeeRusse poupee2 = new PoupeeRusse(4,true,false,false);
		
		//boolean test1 = poupee1.ouvrir();
		//boolean test2 = poupee2.fermer();
		boolean test3 = poupee1.placerDans(poupee2);
		boolean test4 = poupee2.placerDans(poupee1);
		boolean test5 = poupee1.sortir(poupee2);
	}

}