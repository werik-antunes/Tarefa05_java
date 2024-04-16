package tarefa_java05;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		/*
		 * 8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere
		 * apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
		 * sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo
		 * pode iniciar em um dia e terminar no dia seguinte.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o inicio do jogo de Xadrez: ");
		int inicio = sc.nextInt();
		System.out.println("Digite o fim do jogo de Xadrez: ");
		int fim = sc.nextInt();
		int tempo;
		if(inicio <= fim) {
			tempo = fim - inicio;
		}else {
			tempo = 24 - inicio + fim;
		}
		System.out.println("A duração do jogo é: " + tempo + " horas");
		sc.close();
	}

}
