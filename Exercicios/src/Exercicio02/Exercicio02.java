package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	
	static boolean chkSum(int N[], int tam, int res) {
		
		for(int i = 0; i < (tam - 1); i++) {
			
			for(int j = (i + 1); j < tam; j++) {
				
				if(N[i] + N[j] == res) {
					
					System.out.println("Os dois números que resultam na soma de " + res + " são: " + N[i] + " e " + N[j]);
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o limite de arrays:");
		int x = sc.nextInt();
		
		int N[] = new int [x];
		
		System.out.println("Digite o resultado da soma:");
		int res = sc.nextInt();
		
		int tam = N.length;
		
		System.out.println("Digite os numero do array:");
		for(int i = 0; i < x; i++) {
			N[i] = sc.nextInt();			
		}
		
		chkSum(N, tam, res);
		
		/*
		if(chkSum(N, tam, res)) {
			
			System.out.println("Os numeros para essa soma de " + res + " existem!!!");
			
		}
		
		else {
			
			System.out.println("Não existem os numeros para essa soma de " + res + ".");
			
		}
		
		*/
		
	}

}
