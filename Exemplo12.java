package tarefa_java05;

import java.util.Scanner;

public class Exemplo12 {

	public static void main(String[] args) {
		/*
		 * 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade
		 * máxima em estoque e quantidade mínima em estoque de um produto. Calcular e
		 * escrever a quantidade média ((quantidademédia = quantidade máxima +
		 * quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
		 * quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a
		 * mensagem 'Efetuar compra'.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite atual em estoque: ");
		int estoqueAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade maxima em estoque: ");
		int  maximo= sc.nextInt();
		
		System.out.println("Digite a quantidade minima em estoque: ");
		int minimo = sc.nextInt();
		
		int media = (maximo + minimo)/2;
		
		if(estoqueAtual >= media) {
			System.out.println("Não efetuar compra");
		}else {
			System.out.println("Efetuar compra");
		}
		sc.close();
	}

}
