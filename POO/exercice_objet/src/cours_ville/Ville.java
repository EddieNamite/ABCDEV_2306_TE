package cours_ville;

public class Ville {

	// stocke le nom de la ville
	private String nomVille;
	// stocke le nom du paus de la ville
	private String nomPays;
	// stocke le nombre d'habitant de la ville
	private int nbHabitants;

	// constructeur par defaut
	public Ville()
	{
		System.out.println("Creation d'une ville par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
	}

	// constructeur avec paramètres
	// J'ai ajouté un << p >> en 1ère lettre des paramètres
	// ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	public Ville(String pNom, int nbre, String pNomPays)
	{
		System.out.println("Creation d'une ville avec ces parametres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
	}
}