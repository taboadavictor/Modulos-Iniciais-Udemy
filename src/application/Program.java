package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Rent[] vect = new Rent[10];
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		if (n <= 10) {
			for (int i = 1; i <= n; i++) {
				System.out.println("Rent #" + i + ":");
				System.out.println("Name:");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Email:");
				String email = sc.next();
				sc.nextLine();
				System.out.println("Room:");
				int room = sc.nextInt();
				vect[room] = new Rent(name, email);
			}

		} else {
			System.out.println("Hotel FULL!");
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}