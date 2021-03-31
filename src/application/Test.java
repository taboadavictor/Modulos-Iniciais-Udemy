package application;

import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String [] vect = new String [] {"Maria", "Bob", "Alex", "Teste"};
		
		/*for (int i = 0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}*/
		
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}