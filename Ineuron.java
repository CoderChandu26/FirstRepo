package assignment_1;

public class Ineuron {

	public static void main(String[] args) {

		int n = 11;

		for (int i = 0; i < n; i++) {
			// for i
			for (int j = 0; j < n; j++) {

				if (j == 0) {
					System.out.print("I");

				} else {
					System.out.print("");
				}

			}
			
			System.out.print(" ");

			// for N
			for (int j = 0; j < n; j++) {

				if ((i == j) || (j == 0) || (j == n - 1)) {
					System.out.print("N");

				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			// for E
			for (int j = 0; j < n; j++) {

				if ((i == 0 && j < n) || (j == 0 || i == n - 1) || (i == (n - 1) / 2 && j <= n - 1)) {
					System.out.print("E");

				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			// for U
			for (int j = 0; j < n; j++) {

				if ((j == 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1) || (j == n - 1 && i != n - 1)) {
					System.out.print("U");

				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			// for R
			for (int j = 0; j < n; j++) {

				if (j == 0 || (i == 0 && j < n - 1) || ((j == n - 1 && i != 0) && (i <= (n - 2) / 2))
						|| (i == (n - 1) / 2) && (j < n - 1) || (i == j) && (i >= (n - 1) / 2) && (j >= 0)) {
					System.out.print("R");

				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			// for O
			for (int j = 0; j < n; j++) {

				if ((i == 0 && j != 0 && j != n - 1) || (j == 0 && i != 0 && i != n - 1)
						|| (i == n - 1 && j != n - 1 && j != 0) || (j == n - 1 && i != 0 && i != n - 1)) {
					System.out.print("O");

				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			// for N
			for (int j = 0; j < n; j++) {

				if ((i == j) || (j == 0) || (j == n - 1)) {
					System.out.print("N");

				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}
}
