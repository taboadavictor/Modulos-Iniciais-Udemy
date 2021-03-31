package Parte_6;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int number;
		String holder;
		double balance;
		
		Account cc;
		
		System.out.println("Enter account number: ");
		number = sc.nextInt();
		System.out.println("Enter account holder: ");
		holder = sc.next();
		sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char verificationDeposit = sc.next().charAt(0);
		if (verificationDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
			cc = new Account (number, holder, balance);
		} else {
			cc = new Account (number, holder);
		}

		System.out.println("Account data:  " + cc );
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		cc.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		cc.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		sc.close();
	}
}