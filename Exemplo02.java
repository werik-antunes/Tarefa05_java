package tarefa_java05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		/*
		 * 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero
		 * como positivo).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();
		if(numero >=0) {
			System.out.println(numero +  " Positivo");
		} else {
			System.out.println(numero + " Negativo");
		}
		sc.close();
	}

}
