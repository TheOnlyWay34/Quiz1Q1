package pkgMain;

import java.util.Scanner;

public class cMain {

	private static Scanner scan1;

	public static void main(String[] args) {
		scan1 = new Scanner(System.in);
		System.out.println("Please input number of Passing Attempts: ");
		double att = scan1.nextDouble();

		System.out.println("Please input number of Pass Completions: ");
		double comp = scan1.nextDouble();

		System.out.println("Please input Total Passing Yards: ");
		double yards = scan1.nextDouble();

		System.out.println("Please input number of Touchdown Passes: ");
		double td = scan1.nextDouble();

		System.out.println("Please input number of Interceptions: ");
		double intc = scan1.nextDouble();

		double a = ((comp / att) - 0.3) * 5;
		double b = ((yards / att) - 3) * 0.25;
		double c = (td / att) * 20;
		double d = 2.375 - ((intc / att) * 25);

		if (a > 2.375) {
			a = 2.375;
		} else if (a < 0.0) {
			a = 0;
		} else {
		}

		if (b > 2.375) {
			b = 2.375;
		} else if (b < 0.0) {
			b = 0;
		} else {
		}

		if (c > 2.375) {
			c = 2.375;
		} else if (c < 0.0) {
			c = 0;
		} else {
		}

		if (d > 2.375) {
			d = 2.375;
		} else if (a < 0.0) {
			d = 0;
		} else {
		}

		double rating = ((a + b + c + d) / 6) * 100;
		System.out.println("Passer Rating: " + rating);
	}

}
