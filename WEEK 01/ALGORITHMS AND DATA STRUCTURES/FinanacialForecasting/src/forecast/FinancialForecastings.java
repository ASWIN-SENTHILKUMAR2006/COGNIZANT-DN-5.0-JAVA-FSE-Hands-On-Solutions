package forecast;

import java.util.Scanner;

public class FinancialForecastings {

	public static double futureValueRecursive(double principal, double rate, int years) {
		if (years <= 0) return principal;
		return futureValueRecursive(principal * (1.0 + rate), rate, years - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		double p = sc.nextDouble();
		System.out.print("Enter annual interest rate: ");
		double r = sc.nextDouble();
		System.out.print("Enter number of years: ");
		int n = sc.nextInt();
		double fv = futureValueRecursive(p, r, n);
		System.out.printf("Future value after %d years: %.2f%n", n, fv);
		sc.close();
	}

}

