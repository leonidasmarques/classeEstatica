package application;

import java.util.Scanner;

import util.Calculador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculador calc = new Calculador();
		
		System.out.println("Informe o valor do raio");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		
		double v = calc.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n ", c);
		System.out.printf("volume: %.2f%n ", v);
		System.out.printf("valor de P: %.2f%n ", calc.PI);
		
		
		//Testando a chave ssh depois de formar o pc

		sc.close();
	}
	
	
	
	

}
