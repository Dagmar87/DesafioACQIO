package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static double sqrt(double n) {
		
		double t;
		
		double raiz = n / 2;
		
		do {
			
			t = raiz;
			
			raiz = (t + (n / t)) / 2;			
			
		} while ((t - raiz) != 0);
		
		return raiz;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros do loop:");
		int l = sc.nextInt();		
		
		for(int i=0; i < l; i++) {			
			
			System.out.println("Entre o numero:");
			double n = sc.nextDouble();
			
			System.out.println("sqrt (" + n + ") = " + sqrt(n));
			
		}

	}

}
