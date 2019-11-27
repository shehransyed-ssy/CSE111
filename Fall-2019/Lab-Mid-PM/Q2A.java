import java.util.Scanner;

public class Q2A {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many numbers would you like to enter?");
		int n = sc.nextInt();
		int [] arr = new int[n]; //array used to hold the user inputs
		int [] count = new int[10]; //array used to count occurences of numbers between 0-9

		System.out.println("Enter the numbers");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count[arr[i]]++; //counting occurences
		}

		int size = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 0) size++; //determining number of unique digits entered by user
		}

		int [] newArr = new int[size]; //final array with duplicates removed
		for(int i = 0, j = 0; i < count.length; i++) {
			if(count[i] > 0) {
				newArr[j] = i;
				j++;
			}
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