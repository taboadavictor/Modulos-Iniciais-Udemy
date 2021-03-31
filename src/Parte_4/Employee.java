package Parte_4;

public class Employee {

	String Name;
	double GrossSalary;
	double Tax;
	
	public double NetSalary() {
		
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		
		double p = (GrossSalary / 100) * percentage;
		GrossSalary = NetSalary() + p;
	}
	
	public String toString(double percentage) {
		return Name	+ ", $" + String.format("%.2f", GrossSalary);
	}
	
	
	
	
	
}
