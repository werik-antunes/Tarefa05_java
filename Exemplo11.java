package tarefa_java05;

import java.util.Scanner;

public class Exemplo11 {

	public static void main(String[] args) {
		/*
		 * 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
		 * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo -
		 * débito + crédito). Também testar se saldo atual for maior ou igual a zero
		 * escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
		 * Negativo'.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta: ");
		double conta = sc.nextDouble();
		
		System.out.println("Digite o saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Digite o débito da conta: ");
		double debito = sc.nextDouble();
		
		System.out.println("Digite o crédito da conta: ");
		double credito = sc.nextDouble();
		
		double salAtual = saldo - debito + credito;
		if(salAtual >= 0) {
			System.out.println("Saldo positivo");
		}else {
			System.out.println("Saldo negativo");
		}
		System.out.println("O saldo atual é R$"+ salAtual);
		sc.close();
	}

}
