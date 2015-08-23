package euler;

public class Utils {
	
	
	public static boolean isOdd(long num){
		// String tag = "isOdd: ";
		// if number is odd, return true
		// if number is not odd, return false
		
		// odd = if number is not divisble by 2
		long test = num % 2;
		if (test == 0){
			return false;
		} else {
			return true;
		}
	}
	
	public static long getHighestMultiple(long num){
		String tag = "getHighestMultiple: ";
		long cnt = 2;
		long res = 0;
		
		// only need to check up to the square root of the number
		double bound = Math.sqrt((double)num);
		long lbound = (long)bound;
		
		while (cnt < lbound){
			int check = (int)(num % cnt);
			
			if (check == 0){
				res = num / cnt;
				System.out.println(tag + "Result of " + num + ": " + res);
				return res;
			} else {
				cnt = cnt + 1;
			}
		}
		System.out.println(tag + "Result of " + num + ": None Found!");
		return res;
	}
	
	public static long getHighestPrimeMultiple(long num){
		String tag = "getHighestPrimeMultiple: ";
		// check only prime numbers
		// return value of highest multiple
		long cnt = (long)Math.floor(Math.sqrt((double)num));
		
		while (cnt > 2){
			if (isPrime(cnt) && isMultiple(num, cnt)){
				System.out.println(tag + "Result of " + num + ": " + cnt);
				return cnt;
			} else if (!euler.Utils.isOdd(cnt)){
				cnt = cnt - 1;
			} else {
				cnt = cnt - 2;
				System.out.println(tag + cnt);
			}
		}
		return 0;
	}
	
	public static long[] getMultiples(long num, int howMany){
//		String tag = "getMultiples: ";
		long[] arr = new long[howMany];
		long cnt = 2;
		int arrPos = 0;
		
		// exclude one and itself
		// cnt is multiple if number is evenly divisible by cnt
		
		while (cnt < num){
			int check = (int)(num % cnt);
			
			if (check == 0){
				arr[arrPos] = num / cnt;
				cnt = cnt + 1;
				arrPos = arrPos + 1;
			}
			cnt = cnt + 1;
		}
		
		return arr;
	}

	public static boolean isMultiple(long num, long div){
		// String tag = "isMultiple: ";
		// returns true if num is divisible by div evenly
		if (num % div == 0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(long num){
			// number is prime if it is odd, and divisible by only itself and 1
	//		String tag = "isPrime: ";
			long cnt = 2;
			boolean result = false;
			if (euler.Utils.isOdd(num)){
				while (cnt < num){
					int test = (int)(num % cnt);
	//				consoleLog(tag + cnt);
					if (test == 0){
						// System.out.println("number " + num + " is divisble by " + cnt);
						return result = false;
					} else {
						cnt = cnt + 1;
					}
				}
				result = true;
			}
			return result;
		}
}
