
public class TestAlphabetOrder {

	public static void main(String[] args) {
		
		
		String temp = "";
		String[] arr = {"abc","bcd","mn","ce","abc","aab","aaa"};
        for(int i =0;i<arr.length;i++)
        {
        	for(int j =0;j<arr.length;j++)
        	{
        		if(i == j)
        			continue;
        		int x = arr[i].compareTo(arr[j]);
        		if(x < 0)
        		{
        			temp = arr[j];
        			arr[j] = arr[i];
        			arr[i] = temp;
        		}
        	}
        	   
        }
        for(String s : arr) {
        	 System.out.println(s);
			
		}
       
	}

}