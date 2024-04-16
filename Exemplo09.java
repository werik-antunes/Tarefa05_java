package tarefa_java05;

import java.util.Scanner;

public class Exemplo09 {

	public static void main(String[] args) {
		/*
		 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O
		 * funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo
		 * é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que
		 * leia o número de horas trabalhadas em um mês, o salário por hora e escreva o
		 * salário total do funcionário, que deverá ser acrescido das horas extras, caso
		 * tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as suas horas trabalhadas neste mes: ");
		double hrTra = sc.nextDouble();
		System.out.println("Digite quanto você quanha por hora: ");
		double ganhoHr = sc.nextDouble(); 
		 
		double salTotal;
		if(hrTra <= 160) {
			salTotal =  hrTra * ganhoHr;
		}else {
			double extra = hrTra - 160 ;
			salTotal = (160 * ganhoHr) + (extra * ganhoHr * 1.5);
		}
		System.out.println("O salario total é R$ " + salTotal);
		sc.close();
	}

}
