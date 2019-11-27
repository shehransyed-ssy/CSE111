import java.util.Scanner;

public class Q2B {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("How many numbers would you like to enter?");
		int n = sc.nextInt();
		int [] arr = new int[n]; //array used to hold the user inputs

		System.out.println("Enter the numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a value for x");
		int x = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) count++; //counting number of occurences of x
		}

		int [] newArr = new int [count];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = x;
		}

		for(int i = 0; i < newArr.length; i++) {
			if(i != newArr.length - 1)
				System.out.print(newArr[i] + ", ");
			else
				System.out.print(newArr[i]);
		}
		System.out.println("\nArray Size: " + newArr.length);
	}
}