package tarefa_java05;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		/*
		 * 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever
		 * o maior deles.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite outro valor: ");
		float numero2 = sc.nextFloat();
		if (numero1 > numero2) {
			System.out.println("O valor maior é: " + numero1);
		}else {
			System.out.println("O valor maior é: " + numero2);
		}
		sc.close();
	}

}
