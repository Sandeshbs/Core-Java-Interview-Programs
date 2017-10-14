public class CompressString      // aaabbccaazz-->a3b2c2a2z2
{
	public static String compressString(String s)
	{
		int count = 1;
		String str = "";
		for(int i=0;i<s.length();i++)
		{
			if(i != (s.length()-1) && (s.charAt(i) == s.charAt(i+1)))
			//if(s.charAt(i) == s.charAt(i+1)) // not works
			{
				count++;
			}
			else
			{
				str = str + s.charAt(i)+count;
				count = 1;
			}
		}
		return str;
	}
	public static void main(String[] args)
	{
		String st = "abbbbcdefffffffggggggggggggggaaaaaaazzzaaaa";
		String result = compressString(st);
		System.out.println(result);
	}
}