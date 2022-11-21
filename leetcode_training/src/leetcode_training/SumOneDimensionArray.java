package leetcode_training;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOneDimensionArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Type the amount of numbers to sum: ");
			int arrayLength = sc.nextInt();
					
			int nums[] = new int[arrayLength];
			
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Type number " + (i+1) + ": ");
				nums[i] = sc.nextInt();
			}
			
			int result[] = new int[nums.length];

			result[0] = nums[0];

			for (int i = 1; i < nums.length; i++) {
				result[i] = nums[i] + result[i - 1];
			}
			
			System.out.println("\n\n"+Arrays.toString(result));
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
	
}
