package euler;

import java.util.Arrays;

public class Main {
	
	public static boolean consoleLog(String x){
		System.out.println(x);
		return true;
	}
	
	public static boolean isOdd(long num){
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
	
	public static boolean isPrime(long num){
		// number is prime if it is odd, and divisible by only itself and 1
		long cnt = 2;
		boolean result = false;
		if (isOdd(num)){
			while (cnt < num){
				int test = (int)(num % cnt);
//				consoleLog(String.valueOf(cnt));
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
	
	public static long[] getMultiples(long num, int howMany){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPrime(4));
//		System.out.println(isPrime(7));
//		System.out.println(isPrime(15));
		System.out.println(Arrays.toString(getMultiples(10, 8)));
		System.out.println(Arrays.toString(getMultiples(1520, 20)));
	}

}