
public abstract class Test {

	public static void main(String[] args) 
	{
		int test = 1000000000;
		DefaultFormatter dformat = new DefaultFormatter();
		System.out.println(dformat.format(test));
		DecimalFormatter dformat2 = new DecimalFormatter();
		System.out.println(dformat.format(test));
		

	}

}
