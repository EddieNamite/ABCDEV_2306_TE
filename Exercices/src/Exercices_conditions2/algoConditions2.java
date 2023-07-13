package Exercices_conditions2;

import java.util.Scanner;

public class algoConditions2 
{


		public static void main(String[] args) 
		{

			
			int age;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir l'age :");
			age = sc.nextInt();
			

			if(age < 6 )
			{
				System.out.println("vous avez " + age +" ans, pas de catgorie");
			}
			
			else if((age == 6) || (age == 7))
			{
				System.out.println("vous avez " + age +" ans, vous etes un poussin");
			}
			
			else if ((age == 8) || (age == 9))
			{
				System.out.println("vous avez " + age +" ans, vous etes un pupille");
			}
			
			
			else if((age == 10) ||( age == 11))
			{
				System.out.println("vous avez " + age +" ans, vous etes un minime");
			}
			
			else
			{
				System.out.println("vous avez " + age +" ans, vous etes un cadet");
			}
		
		}

}
