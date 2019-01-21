
public class SwapNumbers {

	public static void main(String[] args) {
		int a = 5, b = 6;

		System.out.println("Initial: " + "a >> " + a + ", b >> " + b);

		a = a + b; // a=11

		b = a - b; // b=5

		a = a - b; // a=6

		System.out.println("After swap: " + "a >> " + a + ", b >> " + b);

	}

}

class SwapNumbersWithTemp {

	public static void main(String[] args) {

		int a = 5, b = 6, temp;

		System.out.println("Initial: " + "a >> " + a + ", b >> " + b);

		temp = a; // temp=5

		a = b; // a=6

		b = temp; // b=5

		System.out.println("After swap: " + "a >> " + a + ", b >> " + b);

	}

}
