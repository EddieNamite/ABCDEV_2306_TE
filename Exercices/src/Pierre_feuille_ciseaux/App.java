package Pierre_feuille_ciseaux;

import java.util.Random;
import java.util.Scanner;

public class App {

static int nombre;
	
public static void main(String[] args) {
		
//pierre = 1;


	
System.out.print("[ JEU DU PIERRE FEUILLE CISEAUX ]");
		
Scanner scanner = new Scanner(System.in);
Random random = new Random();

nombre = random.nextInt(3)+1;
		
System.out.println(nombre);
		
		
		
	}

}
