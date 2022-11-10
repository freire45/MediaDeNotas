package br.com.erickfreire.mediadenotas;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contadorNotas = 1;
		int media;
		int nota;
		
		System.out.println("Programa que calcula a média de 10 notas: ");
		
		while(contadorNotas <=10) {
			System.out.print("Insira uma nota: ");
			nota = entrada.nextInt();
			total = total + nota;
			contadorNotas = contadorNotas + 1;			
		}
		
		media = total / 10;
		
		System.out.printf("%nTotal da Soma das 10 notas: %d %n", total);
		System.out.printf("Média das Notas: %d%n", media);

	}

}
