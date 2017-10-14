public class CheckStringLetters
{
	public int count(String s1,String s2)
	{
		int count=0;
		int pos = 0;
		while((pos=s1.indexOf(s2,pos))!=-1)
		{
			count++;
			pos++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		CheckStringLetters c = new CheckStringLetters();
		int result = c.count("sandeshsa","sa");
		System.out.println(result);
	}

}
class sameAsAbove
{
	public static void main(String[] args) {
		
		String str = "sandeshbssasasasa";
		int count = 0;
		for(int i =0;i<str.length();i++)
		{
			if(str.indexOf("sa",i) == i)
			{
				count++;
			}
		}
		System.out.println("sa ocuurs :"+count);
	}
	
}





















