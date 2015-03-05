package codeEval_Easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class LowerCase {
	
	public static void main(String[] args) {
		try{
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String currentLine;
			String lowerCaseLine = "";
			while ((currentLine = br.readLine())!=null)
			{
				currentLine = currentLine.trim();
				for (int i=0; i<currentLine.length();i++)
				{
					if (currentLine.charAt(i)>=65 && currentLine.charAt(i)<=90 )//checks ASCII value. A = 65,Z=90
					{
						lowerCaseLine += (char)(currentLine.charAt(i)+32);//difference of 32 between lower case and higher case letters
					}
					else
						lowerCaseLine += currentLine.charAt(i);
				}
				System.out.println(lowerCaseLine);
				lowerCaseLine="";
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
