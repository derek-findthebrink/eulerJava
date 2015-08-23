package euler;

public class Eu4 {
	
	public static int toInt(char[] arr){
		int num = Integer.parseInt(new String(arr));
		return num;
	}
	
	public static char[] reverseArray(char[] arr){
//		char[] newArr = new char[arr.length];
		for (int i = 0; i < arr.length / 2; i++){
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
	
	public static boolean isPalindromic(int num){
		// returns true if the number can be read the same way forward as it is backward
		// is equal to itself but backward
		// turn into array, separate on array length / 2, recompose, check equality
		
		String str = String.valueOf(num);
		char[] strArr = str.toCharArray();
		
		if (!euler.Utils.isOdd((long)strArr.length)){
			int half = strArr.length / 2;
			char[] one = new char[half];
			char[] two = new char[half];
			
			System.arraycopy(strArr, 0, one, 0, one.length);
			System.arraycopy(strArr, half, two, 0, two.length);
			
			int numOne = toInt(one);
			int numTwo = toInt(reverseArray(two));
			
//			System.out.println(numOne);
//			System.out.println(numTwo);
			
			if (numOne == numTwo){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	
	public static int findLargestPalindrome(int x, int y){
		String tag = "findLargestPalindrome: ";
		// takes the hightest possible number, finds highest palindromes, checks for multiples that are above lower limit
		int highBound = x * x;
		int lowBound = y * y;
		int palCount = 0;
		int lastPal = 0;
		
		int testLimit = (899 * 300) + 3;
		int count = 0;
		
		int interFirst = x;
		int interSecond = x;
		
		while (interFirst > y){
			if (interSecond < y){
				interSecond = x;
				interFirst = interFirst - 1;
			}
			int product = interFirst * interSecond;
			//System.out.println(tag + product + " = " + interFirst + " * " + interSecond + " | count: " + count);
			if (isPalindromic(product) && product > lastPal){
				lastPal = product;
				palCount++;
				System.out.println(tag + "Palendrome found: " + product + " | " + palCount + " | " + interFirst + " * " + interSecond);
			}
			interSecond--;
			count++;
		}
		
		
		return lastPal;
		}
	
	
	public static void challenge(){
		System.out.println("Euler Challenge 4: Pallendromic Numbers");
		findLargestPalindrome(999, 100);
	}
}
