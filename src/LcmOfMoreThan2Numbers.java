
public class LcmOfMoreThan2Numbers {

	public static void main(String[] args) {

		long[] arr1 = {2,3,5};
		long lcm = arr1[0];
		for(int i = 1;i<arr1.length;i++) {
			lcm = getLcm(lcm,arr1[i]);
		}
		System.out.println("LCM = "+lcm);
	}
	public static long getLcm(long l1,long l2) {
		if(l1 < 1 || l2 < 1 ) {
			throw new IllegalArgumentException("pass >0 value");
		}
		long big,small;
		if(l1 > l2)
		{
			big = l1;
			small = l2;
		}
		else
		{
			big = l2;
			small = l1;
		}
		for(int i=1;i<big;i++) {
			if(((i*big)%small) == 0) {
				return (i*big);
			}
		}
		return -1;
	}

}
