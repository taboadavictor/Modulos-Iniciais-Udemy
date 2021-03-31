package application;

import java.util.Locale;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		n = sc.nextInt();
		
		double vect [] = new double [3];
		
		for (int i = 0; i < n; i++) {
			vect [i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for (int i=0; i < n; i++) {
			sum += sum = vect[i];
		}
		
		System.out.println("Média de Altura: " + sum / n);
		
		sc.close();
		*/
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		Product [] vect = new Product [n];
		
		for (int i = 0; i < vect.length; i ++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect [i] = new Product (name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.println("Total: " + sum / n);

		sc.close();
		
	}
}