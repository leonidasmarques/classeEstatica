package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o valor do raio");
		double raio = sc.nextDouble();
		
		double c = circuferencia(raio);
		
		
		double v = volume(raio);
		
		System.out.print("Circuferencia: %.2f%n ", c);
		
		
		
		
		
		
		sc.close();

	}

}
