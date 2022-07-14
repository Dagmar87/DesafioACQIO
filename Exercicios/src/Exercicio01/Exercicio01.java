package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static int getDec(String hex) {
		
		String dig = "0123456789ABCDEF";
		
		hex = hex.toUpperCase();
		
		int v = 0;
		
		for(int i = 0; i < hex.length(); i++) {
			
			char c = hex.charAt(i);
			
			int d = dig.indexOf(c);
			
			v = 16 * v + d;
			
		}
		
		return v;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o valor hexadecimal:");
		String hex = sc.next();
		
		System.out.println("O valor decimal de " + hex + " é: " + getDec(hex));

	}

}
