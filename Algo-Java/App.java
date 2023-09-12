package exemple_objets_ville;



public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse" , 108038, "France");
		
		
		System.out.println(ville1.comparerVille(ville2));
		ville2.setNbHabitants(2000000);
		ville2.setNomVille("Paris");
		System.out.println(ville1.comparerVille(ville2));
		System.out.println("Le nombre d'instance de ville est "+ville2.getNbInstances());
	}
}
