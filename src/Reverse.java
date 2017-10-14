public class Reverse
{
	public static void swapAndReverse(String str)
	{
		int len = str.length();
		char[] c = str.toCharArray();
		for(int i=0;i<len/2;i++)
		{
			c[i] = (char)(c[i]^c[len-i-1]);
			c[len-i-1] = (char)(c[i]^c[len-i-1]);
			c[i] = (char)(c[i]^c[len-i-1]);
		}
		String s = new String(c);
		System.out.println("your reversed string is :"+s);
	}

	public static void main(String[] args)
	{
		String str = "mogambo";
		System.out.println("your original string is:"+str);
		swapAndReverse(str);
	}
}