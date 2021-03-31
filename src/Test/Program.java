package Test;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Rent [] vect = new Rent [10];
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.printf("Name : ");
			String name = sc.next();
			sc.nextLine();
			System.out.printf("Email : ");
			String email = sc.next();
			sc.nextLine();
			System.out.printf("Room : ");
			int room = sc.nextInt();
			
			vect[room] = new Rent (name, email);
			System.out.println("--------");
		}

		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
	}
}