package tarefa_java05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		/*
		 * 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
		 * 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o número
		 * de maçãs compradas, calcule e escreva o custo total da compra.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas maçâs você comprou: ");
		int fruta = sc.nextInt();
		double gasto;
		if(fruta < 12) {
			 gasto = fruta * 1.30;
			
		}else{
			 gasto = fruta * 1.00;
		}
		System.out.println("O gasto total foi: " + gasto);
		sc.close();
	}

}
