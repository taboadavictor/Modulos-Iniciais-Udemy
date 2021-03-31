package Parte_5;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;


	public static double trade (double dollar, double dBought) {
		
		return (dollar * dBought) + (dollar * dBought * 0.06);
	}
}