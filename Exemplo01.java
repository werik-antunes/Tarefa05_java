package tarefa_java05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		/*
		 * 1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for
		 * maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: " );
		int numero = sc.nextInt();
		if(numero > 10) {
			System.out.println(numero + " é maior que 10!");
		}else {
			System.out.println(numero + " Não é maior que 10!");
		}
		sc.close();
	}

}
