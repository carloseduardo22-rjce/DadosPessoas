package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vetor1 = new double[n];
		char[] vetor2 = new char[n];
		
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			vetor1[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			vetor2[i] = sc.next().charAt(0);
		}
		
		// maioraltura
		double maioraltura = vetor1[0];
		for (int j=0; j<n; j++) {
			if (vetor1[j] > maioraltura) {
				maioraltura = vetor1[j];
			}
		}
		
		// menoraltura
		double menoraltura = vetor1[0];
	    for (int i=1; i<n; i++) {
	        if (vetor1[i] < menoraltura) {
	            menoraltura = vetor1[i];
	        }
	    }
	    
	    // somando e depois obtendo média
	    double soma = 0.0;
	    for (int i=0; i<n; i++) {
	    	soma += vetor1[i];
	    }
	    double avg = soma/n;

		
		System.out.println();
	    System.out.printf("Menor altura: %.2f%n", menoraltura);
		System.out.printf("Maior altura: %.2f%n", maioraltura);
		System.out.printf("Media das mulheres: %.2f%n", avg);
		
		// contador de homens
		int contadorhomens = 0;
		for (int j=0; j<n; j++) {
			if (vetor2[j] == 'M') {
				contadorhomens += 1;
			}
		}
		
		System.out.printf("Numero de homens = %d", contadorhomens);
		
		
	}

}