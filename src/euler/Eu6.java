package euler;

public class Eu6 {
	
	public static long getSumOfSquaresInRange(long init, long upper){
		String tag = "getSumOfSquares: ";
		// squares each number, starting from one up to upper, and adds each sum to final
		long sum = 0;
		int count = (int)init;
		
		while (count <= upper){
			long square = (long)count * (long)count;
			sum += square;
//			System.out.println(tag + count + " squared: " + square);
			count++;
		}
//		System.out.println(tag + "Sum is: " + sum);
		return sum;
	}
	
	public static long getSumOfNumbersInRange(long init, long upper){
		String tag = "getSumOfNumbersInRange: ";
		
		long sum = 0;
		int count = (int)init;
		
		while (count <= upper){
			sum += count;
			count++;
		}
//		System.out.println(tag + sum);
		return sum;
	}
	
	public static long getDifferenceSumOfSquaresAndSquareOfSum(long init, long upper){
		String tag = "getDifferenceSumOfSquaresAndSquareOfSum: ";
		

		long sum = getSumOfNumbersInRange(init, upper);
		long squareOfSum = sum * sum;
		
		long sumOfSquares = getSumOfSquaresInRange(init, upper);
		
		long diff = squareOfSum - sumOfSquares;
		
		System.out.println(tag + diff + " | " + squareOfSum + " - " + sumOfSquares);
		return diff;
	}
	
	public static void challenge(){
		System.out.println("Euler Challenge 6: sum square difference");
		getDifferenceSumOfSquaresAndSquareOfSum(0, 100);
	}
}
