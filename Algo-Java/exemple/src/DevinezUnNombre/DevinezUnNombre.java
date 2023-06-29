package DevinezUnNombre;
import java.util.Random;
import java.util.Scanner;

public class DevinezUnNombre {

    public static void main(String[] args) {

        int ans, guess, guessNum = 0;
        final int maxGuesses = 7;
        String str, playAgain = "o";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        ans = generator.nextInt(101) + 1;

        while (playAgain.equals("o") || playAgain.equals("O")) {
            System.out.println("Hello !! Bienvenue dans mon Eddie Jeu devinez un nombre entre 1 et 100 ( 7 essais possible )");
            System.out.println("Entrez un nombre (0 pour quitter):");

            guess = scan.nextInt();
            guessNum = 0;
            while (guess != 0)
            {
                guessNum++;
                if (guess == ans) {
                    System.out.println("Bravo !!");
                    break;
                } else if	 (guess < ans)
                    System.out.println("Opss! Trop petit ! essayez un autre nombre");
                else if (guess > ans)
                    System.out.println("Opss! Trop grand ! essayez un autre nombre");
                if (guessNum == maxGuesses) {
                    System.out.println("Le nombre était " + ans +"\nPlus de chance la prochaine fois !");
                    break;
                }
                System.out.println("Entrez un nombre (0 pour quitter):");
                guess = scan.nextInt();
            }
            System.out.println("Une autre partie?(o/n)");
            playAgain = scan.next();
        }
        System.out.println("Merci d'avoir joué à mon jeu !");
    }
}