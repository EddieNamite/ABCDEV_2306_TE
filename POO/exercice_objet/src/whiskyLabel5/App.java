package whiskyLabel5;

public class App {

	public static void main(String[] args) 
	{
		BouteilleWhisky Label5= new BouteilleWhisky("Label5",0.70,0.50,true);
		
		boolean test1 = Label5.fermer();
		boolean test2 = Label5.ouvrir();
		boolean test3 = Label5.remplir(0.1);
		boolean test4 = Label5.remplir(1);
		boolean test5 = Label5.remplirTout();
		boolean test6 = Label5.viderTout();
	}

}
