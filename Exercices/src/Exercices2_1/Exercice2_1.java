package Exercices2_1;

import java.util.Scanner;

public class Exercice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int age;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Saisir votre age");
	age = sc.nextInt();
	
	if(age < 1)
	{
		System.out.println("Vous n'etes pas encore ne");
	}
	else if(age<18)
	{
		System.out.println("Vous etes mineur");
	}
	else
	{
		System.out.println("Vous etes majeur");
	}

}
}