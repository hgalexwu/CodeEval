package codeEval_Easy;

public class PrimePalindrome {

	public static void main (String[] args) {
		int currentLargest = 0;
		boolean isPalindrome = true;
		for (int i=0;i<1000;i++)
		{
			String characters = String.valueOf(i);
			for (int j=0; j<characters.length()/2;j++)
			{
				if (characters.charAt(j) != characters.charAt(characters.length()-1-j))
				{
					isPalindrome = false;
					break;
				}
			}
			for (int x=2; x<i && isPalindrome; x++)
			{
				if (i % x == 0)
					break;
				else if (x+1 == i)
					currentLargest = i;
			}
			isPalindrome = true;
		}
		System.out.println(currentLargest);
	}
}
