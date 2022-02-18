package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double a,b;
		System.out.println("Digite o primeiro valo");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valo");
		b = scan.nextDouble();
		
		Double soma = soma(a,b);
		Double subtracao = (double) subtracao(a,b);
		Double multiplicacao = (double) multiplicacao(a,b);
		Double divisao = (double) divisao(a,b);
		
		System.out.println("SOMA "+soma);
		System.out.println("Subtração "+subtracao);
		System.out.println("Multiplicação "+multiplicacao);
		System.out.println("Divisão "+divisao);
	}
	
	public static  Double soma(Double a, Double b) {
		return a + b;
	}
	public static  Double subtracao(Double a, Double b) {
		return a - b;
	}
	public static  Double divisao(Double a, Double b) {
		return (Double) (a / b);
	}
	public static  Double multiplicacao(Double a, Double b) {
		return a * b;
	}
} 
