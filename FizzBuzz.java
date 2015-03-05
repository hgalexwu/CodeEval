package codeEval_Easy;
import java.io.*;
public class FizzBuzz {

	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		String currentLine;
		while((currentLine = br.readLine())!=null)
		{
			String[] numbers = new String[3];
			String print = "";
			currentLine = currentLine.trim();
			numbers = currentLine.split(" ");
			for (int i=1; i<=Integer.parseInt(numbers[2]);i++)
			{
				if (i%Integer.parseInt(numbers[1])==0 && i%Integer.parseInt(numbers[0])==0)
					print += "FB ";
				else if (i%Integer.parseInt(numbers[1])==0)
					print += "B ";
				else if (i%Integer.parseInt(numbers[0])==0)
					print += "F ";
				else
					print += i + " ";
			}
			System.out.println(print.trim());
		}
		br.close();
	}
}
