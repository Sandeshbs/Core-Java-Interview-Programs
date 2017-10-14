public class AlphabetFrequencyCount
{
	public static String lettersCount(String str)
	{
		int count = 0;
		String temp = "";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			for(int j=i;j<str.length();j++)  //or for(int j=0;j<str.length();j++)
			{
				char k = str.charAt(j);
				if((c == k) && (temp.indexOf(c) == -1))
				{
					count = count + 1;
				}
			}
			if(temp.indexOf(c) == -1)
			{
				temp = temp + c;
			}
			if(count !=0)    //fanny ....
			temp = temp+count;
			count = 0;
		}
		return temp;
		//System.out.println(temp);
	}

	public static void main(String[] args)
	{
		String st = "aaaabbbbcccbbbbbdzzzzaaaaa";
		String res = lettersCount(st);
		System.out.println(res);
	}

}