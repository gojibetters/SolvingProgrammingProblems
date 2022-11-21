package leetcode_training;

import java.util.Arrays;

public class RichestCustomerWealth {

	public static void main(String[] args) {

		int[][] accounts = {{ 1, 2, 3, 4 },
							{ 4, 3, 2, 1 },
							{ 1, 2, 3, 1 },
							{ 5, 3, 8, 2 } };

		int[][] userAccounts = new int[accounts.length][accounts[0].length];
		int[] sumAccounts = new int[accounts.length];
		int biggestWealth;

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[0].length; j++) {

				userAccounts[i][j] = accounts[i][j];

				sumAccounts[i] += userAccounts[i][j];

			}
		}

		Arrays.sort(sumAccounts);
		biggestWealth = sumAccounts[sumAccounts.length - 1];

		System.out.println("The biggest wealth is: "+biggestWealth);

	}

}
