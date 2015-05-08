package codeEval_Easy;

public class SumOfPrimes {
	
	public static void main (String args[]){
		
		int sum = 0;
		int counter = 0;
		int number = 2;
		while (counter < 1000)
		{
			if (number == 2)
			{
				counter++;
				sum = sum + number;
			}
			for (int j=2; j<number; j++)
			{
				if (number%j == 0)
					break;
				else if (j+1 == number)
				{
					sum = sum + number;
					counter++;
				}
			}
			number++;
		}
		System.out.println(sum);
	}
}
