package application;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after: " + months + " months");
		System.out.println(String.format("%.2f", payment));
		}
		catch (InvalidParameterException e) {
			System.out.println("Invalid Parameter: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Input error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
