package application;

import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o valor do raio");
		double raio = sc.nextDouble();
		
		double c = circuferencia(raio);
		
		
		double v = volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n ", c);
		System.out.printf("volume: %.2f%n ", v);
		System.out.printf("valor de P: %.2f%n ", PI);

		sc.close();
	}
	
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
	

}
