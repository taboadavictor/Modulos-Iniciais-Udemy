package Parte_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Entre com largura e altura do retângulo");
		rectangle.width = sc.nextDouble();
		sc.nextLine();
		rectangle.height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		Employee employee = new Employee ();
		
		System.out.println("Entre com o nome do funcionário:");
		employee.Name = sc.nextLine();
		System.out.println("Salário Bruto");
		employee.GrossSalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Imposto");
		employee.Tax = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("Employee: %s  $ %.2f %n %n", employee.Name, employee.NetSalary());
		System.out.printf("Which percentage to increase salary? ");
		
		double imposto = sc.nextDouble();
		employee.IncreaseSalary(imposto);
		
		System.out.printf("Updated data: %s", employee.toString(imposto));
		*/
		
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Student student;
		student = new Student();
		
		System.out.println("Nome:");
		student.name = sc.nextLine();
		System.out.println("Notas:");
		student.gradeA = sc.nextDouble();
		sc.nextLine();
		student.gradeB = sc.nextDouble();
		sc.nextLine();
		student.gradeC = sc.nextDouble();
		sc.nextLine();
		
		student.resultado();
		
	
	}
}