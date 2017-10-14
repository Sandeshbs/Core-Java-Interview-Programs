
public class EncodingOfString {
	
	public static void main(String[] args)
	{
		String str = "abcdezzzz";
		String s = "";
		 
		for(int i =0; i<str.length();i++)
		{
			if(str.charAt(i) != 'z')
			{
				char c = str.charAt(i);
				char m = (char)(c+1);
				s = s+m;
			}
			else
			s = s+(char)97;
		}
		System.out.println(s);
	}
	

}
