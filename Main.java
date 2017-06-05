import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String[] array=input.readLine().split(" ");
		System.out.println(diffOfEvenAndOdd(array));
	}
	
	public static int diffOfEvenAndOdd(String[] array)
	{
		int even=0;
		int odd=0;
		int diff=0;
		for(int i=0;i<=array.length-1;i++)
		{
			if(Integer.parseInt(array[i])%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		diff=Math.abs(even-odd);
		return diff;
	}
}
