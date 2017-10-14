import java.util.*;
public class UnicqeWordsUseCollection
{
	public static void main(String[] args)
	{
		String text = "is this is your pen! yes this is my pen";
		String[] ch = text.split(" ");
		Set s = new LinkedHashSet();
		for(int i =0;i<ch.length;i++)
		{
			s.add(ch[i]);
		}
		System.out.println(s);
		for(Object o : s)
		{
			System.out.print(o+" ");
		}
	}
}














