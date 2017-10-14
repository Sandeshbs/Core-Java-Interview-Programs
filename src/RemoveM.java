import java.util.ArrayList;


public class RemoveM {

	public static String remove(String str)
	{
		int count = 0;
		char[] c = str.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i =0;i<c.length;i++)
		{
			al.add(c[i]);
		}
		java.util.Iterator<Character> it = al.iterator();
		while(it.hasNext())
		{
			char c1 = it.next();
			if((c1 == 'm' || c1 == 'M') && count != 3)
			{
				it.remove();
				count ++;
			}
		}
		String s = "";
		for(Character f : al)
		{
			s = s+f;
		}
		return s;
	}
	
}
class Test
{
	public static void main(String[] args) 
	{
		String s = " MMMimmm am fine baby M how r u mmm";
		System.out.println(s);
		String f = RemoveM.remove(s);
		System.out.println(f);
	}
}











