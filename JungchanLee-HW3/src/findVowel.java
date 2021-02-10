
public class findVowel {
	public static void main (String[] args)
	{
		System.out.print(findVowels("Matthew"));
	}
	
	static int findVowels (String sample)
	{
		
		char s;
		int count = 0;
		
		for(int i = 0; i < sample.length(); i++)
		{
			s = sample.charAt(i); 
			
			if (s == 'a') 
			{
				count++;
			}
			else if (s == 'A')
			{
				count++;
			}
			else if (s == 'e')
			{
				count++;

			}
			else if (s == 'E')
			{
				count++;

			}
			else if (s == 'i')
			{
				count++;

			}
			else if (s == 'I')
			{
				count++;

			}
			else if (s == 'o')
			{
				count++;

			}
			else if (s == 'O')
			{
				count++;

			}
			else if (s == 'u')
			{
				count++;

			}
			else if (s == 'U')
			{
				count++;
			}
		
		}
		
		
		return count;
	}
}
