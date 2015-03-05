package codeEval_Easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Fibonacci {

	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String currentLine;
		while ((currentLine = br.readLine())!=null)
		{
			long fib1=0;
			long fib2=1;
			long sum=1;
			if (Integer.parseInt(currentLine)==0)
				System.out.println("0");
			else
			{
				for (int i=0;i<Integer.parseInt(currentLine)-1;i++)
				{
					sum=fib1+fib2;
					fib1=fib2;
					fib2=sum;
				}
				System.out.println(sum);
			}
		}
		br.close();
	}
}
