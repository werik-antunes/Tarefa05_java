package tarefa_java05;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		/*
		 * 7) Ler dois valores (considere que não serão lidos valores iguais) e
		 * escrevê-los em ordem crescente.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double numero1 = sc.nextDouble();
		System.out.println("Digite outro valor: ");
		double numero2 = sc.nextDouble();
		if (numero1 < numero2) {
			System.out.println("Os valores em ordem crescentes é " + numero1 + ", " + numero2);
		}else {
			System.out.println("Os valores em ordem crescentes é " + numero2 + ", " + numero1);
		}

		sc.close();
	}

}
