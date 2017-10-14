public class EncodedString
{
	public static void encodeString(String str)
	{
		String alp = "abcdefghijklmnopqrstuvwxyz";
		//char c1 = s.toCharArray();
		//char c2 = str.toCharArray();
		String encodedStr = "";
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<alp.length();j++)
			{
				if(str.charAt(i) == alp.charAt(j))
				{
					if(alp.charAt(j) != 'z')
					{
						encodedStr = encodedStr+alp.charAt(j+1);
					}
					else
					encodedStr = encodedStr+alp.charAt(0);
				}
			}
		}
		System.out.println("your string is :"+str+" encoded string is :"+encodedStr);
	}
	public static void main(String[] args)
	{
		String str = args[0];   //command line argument...!!
		encodeString(str);
	}
}