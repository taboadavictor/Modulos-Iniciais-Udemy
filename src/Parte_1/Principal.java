package Parte_1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x, y, media;
		
		System.out.println("Digite a nota do primeiro aluno:");
		x = sc.nextDouble();
		
		System.out.println("Digite a nota do segundo aluno:");
		y = sc.nextDouble();
		
		media = (x + y)/2;
		System.out.println("A média dos alunos é de " + media);
		sc.close();

	}
}