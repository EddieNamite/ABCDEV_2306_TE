package MaSoupeLiebig;

public class App 
{

	public static void main(String[] args) 
	{
	
	Soupe liebig = new Soupe("Liebig",1,0.75,true);
		
		boolean test1 = liebig.fermer();
		boolean test2 = liebig.ouvrir();
		boolean test3 = liebig.viderTout();
		boolean test4 = liebig.vider(0.25);
	
	
	
	}

}
