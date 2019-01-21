/*
 * Intended to compare the given number with the sum of 2 elements of the array. 
 * 	Algorithm complexity O(n*n) for the isSatisfied method.
 *  Algorithm complexity O(n) for the isSatisfied2 method.
 */
public class Compare {
	


	public static void main(String[] args) {
		
		int dizi[] = {1,3,5,7,11,15};
		int number = 55;
		
		
//		System.out.println("isSatisfied returned: "+ isSatisfied(dizi, number));
		System.out.println("isSatisfied2 returned: "+ isSatisfied2(dizi, number));

		
	}
	
	
	public static boolean isSatisfied(int dizi1[], int number1) {
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = i + 1; j < dizi1.length; j++) {
				if (dizi1[i] + dizi1[j] == number1) {
					return true;

				}

			}

		}
		return false;
	}
	
	public static boolean isSatisfied2(int dizi1[], int number1) {

		int total = dizi1[0] + dizi1[dizi1.length - 1];

		for (int i = 0; i < dizi1.length; i++) {
			// diziyi son elemandan baslayarak sagdan sola kaydir
			if (total > number1) {
				total = dizi1[dizi1.length - 1 - i] + dizi1[i];
			}
			// diziyi sol elemandan baslayarak soldan saga kaydir
			else if (total < number1) {
				total = dizi1[dizi1.length - 1] + dizi1[i];

			} else {
				return true;

			}

		}

		return false;

	}
}
