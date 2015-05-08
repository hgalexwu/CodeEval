package codeEval_Easy;
import java.io.*;
import java.util.Stack;

public class ReverseWords {
	
	public static void main (String[] args) throws IOException{
		try
		{
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			String currentLine = br.readLine();
			String reverse = "";
			while (currentLine != null)
			{
				currentLine.trim();
				Stack<String> reverseOrderWords = new Stack<>();
				String[] naturalOrderWords = currentLine.split(" ");
				for (int i=0; i<naturalOrderWords.length; i++)
				{
					reverseOrderWords.push(naturalOrderWords[i]);
				}
				while (!reverseOrderWords.isEmpty())
					reverse += reverseOrderWords.pop() + " ";
				currentLine = br.readLine();
				System.out.println(reverse);
				reverse = "";
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
