import java.util.Scanner;


public class MyPrgStringReverse {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter your string:");
		String str = sc.nextLine();
		System.out.println("Before sorting :"+str);
		String res = swapChars(str);
		System.out.println("After  sorting :"+res);
	}
		public static String swapChars(String str)
		{
			char[] ch = str.toCharArray();
			int len = ch.length;
			for(int i = 0;i<len/2;i++)
			{
				char temp = ch[i];
				      ch[i] = ch[len-i-1];
				      ch[len-i-1] = temp;
			}
			return new String(ch);
		}

}
