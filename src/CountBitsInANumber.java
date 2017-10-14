
public class CountBitsInANumber {

	public static void main(String[] args) {
		int count = 0;
		int num = 5;
		int value = num;
		while(value !=0 )
		{
			if(value%2 == 1)
				count++;
			value = value>>>1;
		}
		System.out.println(num+" contains "+count+" bits ");
	}

}
