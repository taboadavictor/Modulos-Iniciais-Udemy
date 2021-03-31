package Parte_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x;
		 * 
		 * x = sc.nextInt();
		 * 
		 * if (x >= 0) { System.out.println("NÃO NEGATIVO"); } else {
		 * System.out.println("NEGATIVO"); }
		 * 
		 * sc.close();
		 * 
		 * 
		 * Scanner sc = new Scanner (System.in);
		 * 
		 * int num;
		 * 
		 * num = sc.nextInt();
		 * 
		 * if (num % 2 == 0) { System.out.println("Par"); } else {
		 * System.out.println("Ímpar"); } sc.close();
		 

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();

		if (B % A == 0 || B / A == 0) {

			System.out.println("São Multíplos");
			
		} else {
			
			System.out.println("Não São Multíplos");
		}
		sc.close();
		
		
		Scanner sc = new Scanner (System.in);
		
		int horaInicio, horaFinal, resultado;
		
		horaInicio = sc.nextInt();
		sc.nextLine();
		horaFinal = sc.nextInt();
		
		if (horaInicio >= 12) {
			
			horaInicio = horaInicio - 12;
			horaFinal = horaFinal + 12;
			resultado = horaFinal - horaInicio;
			System.out.printf("O jogo durou %d horas %n", resultado);
			
		} else if (horaInicio == horaFinal) {
			
			resultado = 24;
			System.out.printf("O jogo durou %d horas %n", resultado);
			
		} else {
			
			resultado = horaFinal - horaInicio;
			System.out.printf("O jogo durou %d horas %n", resultado);
		}
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int id, quantidade;
		double valor;
		
		System.out.println("Entre com o ID do produto e quantidade");
		id = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (id == 1) {
			
			valor = (double) 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
			
		} else if (id == 2) {
			
			valor = (double) 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
			
		} else if (id == 3) {
			
			valor = (double) 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
			
		} else if (id == 4) {
			
			valor = (double) 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
			
		} else if (id == 5) {
			
			valor = (double) 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 25) {
			System.out.println("Intervalo 0, 25");
		} else if (x > 25 && x <= 50) {
			System.out.println("Intervalo 25, 50");
		} else if (x > 50 && x <= 75) {
			System.out.println("Intervalo 50, 75");
		} else if (x > 75 && x <= 100) {
			System.out.println("Intervalo 75, 100");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
		*/
		
	}
}