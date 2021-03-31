package Parte_4;

public class Student {

	String name;
	double gradeA, gradeB, gradeC;
	
	public void resultado() {
		
		double resultado = gradeA + gradeB + gradeC;
		
		if(resultado >= 60 ) {
			System.out.printf("FINAL GRADE: %.2f %n PASS", resultado);
		} else {
			double debito = 60 - resultado;
			System.out.printf("FINAL GRADE: %.2f %n FAILED %n MISSING %.2f POINTS", resultado, debito);
		}
		
	}
	
}
