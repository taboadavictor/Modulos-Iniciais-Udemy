package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List <Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee " + (i + 1) + "# : ");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken! Enter new id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee (id, name, salary);
			list.add(emp);
			System.out.println("---------------");
		}
		
		System.out.printf("Enter the employe id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
			
		
		Integer pos = position (list, idSalary);
		if (pos == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position (List <Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	public static Boolean hasId (List <Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	
	
	
	
}