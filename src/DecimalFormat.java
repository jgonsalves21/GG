
public class DecimalFormat implements NumberFormatter
	{

	public String format(int num)
	{
		String formatted = num + "";
		
		for (int i = formatted.length() - 3; i > 0; i-=3)
		{
			String str1 = formatted.substring(0, i);
			String str2 = formatted.substring(i);
			formatted = str1 + "," + str2;
		}
		return formatted;
	}
}
