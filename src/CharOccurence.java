
public class CharOccurence {
	
	public static void main(String[] args)
	{
		String str = "aaabbbxxzaaaazhaaaa";

		int[] arr = new int[26];
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			arr[c - 'a']++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				System.out.println((char)('a'+i)+" occures "+arr[i]);
			}
		}
	}

}
