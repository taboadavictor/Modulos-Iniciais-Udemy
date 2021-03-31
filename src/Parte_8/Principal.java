package Parte_8;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account account;
		
		System.out.println("Enter name account: ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Number Account: ");
		int number = sc.nextInt();
		
		System.out.println("Deposit initial value? (y/n) ");
		char verify = sc.next().charAt(0);
		
		if (verify == 'y') {
			
			System.out.println("Enter initial deposit value");
			double amount = sc.nextDouble();
			account = new Account (name, number, amount);
		
		} else {
			
			account = new Account (name, number);
		}
		
		System.out.println(account);
		
		System.out.println("Enter deposit value:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println(account);
		
		System.out.println("Enter withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println(account);
		
		sc.close();
		
		
	}
}