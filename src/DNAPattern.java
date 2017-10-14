import java.util.HashMap;
import java.util.Map;


public class DNAPattern {
	
	public static int dna(String s)
	{
		int count = 1;
		int temp =0;
		if(s.contains("A") || s.contains("C")|| s.contains("G")||s.contains("T"))
		{
			for(int i=0;i<s.length();i++)
			{
				char c1 = s.charAt(i);
				if(i != (s.length()-1) && (c1 == 'A' || c1 == 'G' || c1=='C' || c1 =='T') && (s.charAt(i+1) == 'A' || s.charAt(i+1) == 'G' || s.charAt(i+1)=='C' || s.charAt(i+1) =='T'))
				{
					count++;
				}
				else
				{
					if(temp < count)
					{
						temp = count;
					}
					count = 1;
				}
			}
			return temp;
		}
		else
		{
			return temp;
		}
	}
	public static void main(String[] args)
	{
		String st = "CAT";
		System.out.println(dna(st));
		Map<String,Integer> m = new HashMap<String,Integer>();
		System.out.println(m == null);
		
	
	}

}
