package tarefa_java05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		/*
		 * 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
		 * aritmética simples e escrever uma mensagem que diga se o aluno foi ou não
		 * aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
		 * Escrever também a média calculada.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota da primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a nota da segunda nota: ");
		float nota2 = sc.nextFloat();
		double media = (nota1 + nota2) / 2;
		if(media >= 6) {
			System.out.println("Parebens você foi Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
		sc.close();
	}

}
