package tarefa_java05;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		/*
		 * 5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
		 * mês em que a pessoa nasceu).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual em que estamos: ");
		int anoAtual = sc.nextInt();
		System.out.println("Digite o ano em que você nasceu: ");
		int anoNasc = sc.nextInt();
		int anos = anoAtual - anoNasc;
		if(anos <= 16) {
			System.out.println("Você nâo tem idade suficiente para votar!");
		}else {
			System.out.println("Pode votar!");
		}
		sc.close();
	}

}
