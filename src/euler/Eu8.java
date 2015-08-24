package euler;

import java.util.Arrays;

public class Eu8 {
	
	public static long getArrayProduct(int[] arr){
		String tag = "getArrayProduct: ";
		long product = 1;
		int cursor = 0;
		
		while (cursor < arr.length){
			product = product * arr[cursor];
			cursor++;
		}
		
		System.out.println(tag + product);
		return product;
	}
	
	public static long getAdjacentProducts(int[] arr, int range){
		String tag = "getAdjacentProducts: ";
		long product = 0;
		int cursor = 0;
		
		int[] intArr = new int[range];
		int winCursor = 0;
		
		while (cursor <= arr.length - range){
			System.arraycopy(arr, cursor, intArr, 0, range);
			long check = getArrayProduct(intArr);
			if (check > product){
				product = check;
				winCursor = cursor;
			}
			cursor++;
		}

		int[] winArr = new int[range];
		System.arraycopy(arr, winCursor, winArr, 0, range);
		System.out.println(tag + product + " is product of adjacents: " + Arrays.toString(winArr) + " at cursor: " + winCursor);
		return product;
	}
	
	public static int[] makeArray(String num){
		int length = num.length();
		int[] newArr = new int[length];
		int cursor = 0;
		
		while (cursor < length){
			newArr[cursor] = Integer.parseInt(num.substring(cursor, cursor + 1));
			cursor++;
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	
	public static void challenge(){
		System.out.println("Euler Challenge 8: Product in a Series");
//		int[] arr = {1, 4, 7, 8, 6, 2, 4, 7, 3, 1, 2, 1};
//		int[] arr = {1, 2, 3};
//		arr = {14, 12, 18};
//		getArrayProduct(arr);
//		getAdjacentProducts(arr, 4);
//		String strArr = "186571432195332145654";
		String strArr = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		int[] theArr = makeArray(strArr);
		getAdjacentProducts(theArr, 13);
	}
}
