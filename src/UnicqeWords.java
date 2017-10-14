public class UnicqeWords  //this is to print 1 times of all words 
{
	public static void unicqeWords(String line)
	{
		String str = "";
		String[] ch = line.split(" ");
		for(int i = 0;i<ch.length;i++)
		{
			boolean b = false;
			for(int j =0;j<i;j++)
			{
				if(ch[i].equals(ch[j]))
				{
					b = true;
					break;
				}
			}
			if( b == false)
			{
				str = str+" "+ch[i];
			}
		}
		System.out.println("Is this is the String what you expected =>"+str);
	}

	public static void main(String[] args)
	{
		String text = "is this is your pen! yes this is my pen";
		System.out.println("YOUR sTRING IS :"+text);
		unicqeWords(text);
	}

}














