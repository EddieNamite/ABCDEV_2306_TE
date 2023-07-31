package ExerciceTableau4;

public class App 
{

	public static void main(String[] args) 
	{
		int tempNumber = 0;
		int[] sumArray = {3, -9, -12, 125, 32};
		
		for(int i = 0; i < sumArray.length; i++) 
		{
			tempNumber += sumArray[i];
		}
		
		System.out.println(tempNumber);
	}

}