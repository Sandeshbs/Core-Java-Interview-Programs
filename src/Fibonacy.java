public class Fibonacy
{
	public int[] generateFib(int limit)
	{
		int[] fib = new int[limit];

		fib[0]=0;
		fib[1]=1;

		for(int i=2;i<limit;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib;
	}
	public static void main(String[] args)
	{
		Fibonacy f = new Fibonacy();
		  int num = 10;
		int[] result = f.generateFib(num);
		for(int i=0;i<num;i++)
		{
			System.out.print(" "+result[i]);
		}
	}
}

