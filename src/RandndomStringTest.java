import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RandndomStringTest {
	
	public static String randomizeString(String s)
	{
		if (s==null) 
			throw new IllegalArgumentException("pass a string :");
		
		ArrayList<Character> al = new ArrayList<Character>();
		char[] arr = s.toCharArray();
		for(char c:arr)
			al.add(c);
		
		Collections.shuffle(al);
		StringBuilder sb = new StringBuilder();
		for (char c:al)
			sb.append(c); 
		
		return sb.toString();
	}

}
class TestRandomString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string to randomize:");
		String input = sc.nextLine();
		String out =  RandndomStringTest.randomizeString(input);
		System.out.println("Before randomizing: "+input);
		System.out.println("After randomizing: "+out);
	}
}


















