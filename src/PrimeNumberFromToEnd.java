import java.util.*;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class PrimeNumberFromToEnd {

	public static void main(String[] args) {
		
		ArrayList al = generatePrimes(200,300);
		for(Object o : al) {
			System.out.println(o);
		}
		

	}
	public static boolean isPrime(int num) {
		
		if( num <= 1) {
			return false;
		}
		if( num == 2) {
			 return true;
		}
		int upTo = (int)Math.sqrt(num)+1;
		
		for(int i =2;i<=upTo;i++) {
			 
			if(num%i == 0 ) {
				return false;
			}
		}
		return true;
	}
	public static ArrayList generatePrimes(int start,int stop) {
		
		if (start > 0 && start <= stop) {
			
			ArrayList ls = new ArrayList();
			for(int i = start;i<=stop;i++)
			{
				if(isPrime(i))
				ls.add(i);
				
			}
			
			return ls;
		}
		else
			throw new IllegalArgumentException("Pass valid >0 inputs");
	}

}








