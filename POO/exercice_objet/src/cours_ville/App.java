package cours_ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse", 108038, "France");
		
		
		System.out.println("\n ville1 = "+ville.getNom()+" ville de "+ville.getNbHabitants()+" habitant(s) se situant en "+ville.getNomPays());		
		System.out.println("\n ville = "+ville.getNom()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
		System.out.println("\n ville2 = "+ville.getNom()+" ville de "+vill2.getNbHabitants()+" habitant(s) se situant en "+vill2.getNomPays());
	}

}
