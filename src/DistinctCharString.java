public class DistinctCharString  //print all lettrs one time if it appears more than once 
{
	public static void nonRepetingCharString(String str)
	{
		String newString = "";
		for(int i=0;i<str.length();i++)
		{
			boolean isRepet = false;
			for(int j=0;j<i;j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					isRepet = true;
					break;
				}
			}
			if(!isRepet)     //if(isRepet == false)
			{
				newString +=str.charAt(i);
			}
		}
		System.out.println(" new String is :"+newString);
	}
	public static void main(String[] args)
	{
		String str = "aaabbbacacca";
		System.out.println("your String is: "+str);
		nonRepetingCharString(str);
	}
}