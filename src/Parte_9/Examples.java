package Parte_9;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Examples {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for (int i=0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat [i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(mat [i] [i] + " ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
		int count = 0;
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat [i] [j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.print("Negative Numbers: " + count);
		sc.close();
	}

}
