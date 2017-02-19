package pkgMain;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please input number of Passing Attempts: ");
		int att = scan1.nextInt();

		System.out.println("Please input number of Pass Completions: ");
		int comp = scan1.nextInt();

		System.out.println("Please input Total Passing Yards: ");
		int yards = scan1.nextInt();

		System.out.println("Please input number of Touchdown Passes: ");
		int td = scan1.nextInt();

		System.out.println("Please input number of Interceptions: ");
		int intc = scan1.nextInt();

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
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		double rating = ((a + b + c + d) / 6) * 100;
		System.out.println("Passer Rating: " + rating);
	}

}
