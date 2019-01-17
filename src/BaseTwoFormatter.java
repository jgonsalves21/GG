
public class BaseTwoFormatter implements NumberFormatter 
{
	
	public String format(int num)
	{
		
		String formatted = "";
		int working = num;
		while(working >= 1)
		{
			formatted = formatted + working%2;
			working = working/2;
		}
		return formatted;
	
	}	
	
}
