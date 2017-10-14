public class WordsReverse
{
	public static void wordsReverse(String input)
	{
		String strReverse ="";
		String[] words = input.split(" ");
		for(int i =0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				strReverse += words[i].charAt(j);
			}
			System.out.print(strReverse+" ");
			strReverse ="";
		}
	}
	public static void main(String[] args)
	{
		String line = "   hai mogambo how are you  ";
		line = line.trim();                    //it removes starting and ending spaces......!!
		System.out.println("your text is :"+line);
		wordsReverse(line);
	}
}