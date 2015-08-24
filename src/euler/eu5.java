package euler;

public class eu5 {
	
	public static boolean hasMultiple(long num, long multiple){
		// if provided number has provided multiple, returns true
		String tag = "hasMultiple: ";
		if (num % multiple == 0){
//			System.out.println(tag + num + " has multiple " + multiple);
			return true;
		}
//		System.out.println(tag + num + " does not have multiple " + multiple);
		return false;
	}
	
	public static long findNumWithMultipleRange(long low, long high){
		String tag = "findNumWithMultipleRange: ";
		long count = (int)high;
		
		// check if count has each multiple
		int testLimit = 1000000 * 500;
		
		while (count < testLimit){
			// only need to check from two up to high
			int checker = 2;
			boolean stillAlright = true;
			while (checker <= high && stillAlright){
				if (!hasMultiple(count, checker)){
					stillAlright = false;
				}
//				System.out.println(tag + count + " " + checker);
				checker++;
			}
			if (stillAlright){
				System.out.println(tag + count + " passes!");
				return count;
			}
			count++;
		}
		System.out.println(tag + "test limits exceeded! checked up to: " + count);
		return count;
	}
	
	public static void challenge(){
		System.out.println("Euler Challenge 5: Smallest Multiple");
		findNumWithMultipleRange(0, 20);
	}
}
