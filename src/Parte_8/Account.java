package Parte_8;

public class Account {

	private String name;
	private int number;
	private double amount;
	
	public Account (String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Account (String name, int number, double amount) {
		this.name = name;
		this.number = number;
		this.amount = amount;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getNumber () {
		return number;
	}
	
	public void setNumber (int number) {
		this.number = number;
	}
	
	public double getAmount () {
		return amount;
	}
	
	public double deposit (double deposit) {
		return amount += deposit;
	}
	
	public double withdraw (double withdraw) {
		return amount = this.amount- withdraw - 5;
	}
	
	public String toString () {
		return "Name "
				+ name
				+ ", Account: "
				+ number
				+ ", Amount: $ "
				+ String.format("%.2f", amount);
	}	
}