package tarefa_java05;

import java.util.Scanner;

public class Exemplo10 {

	public static void main(String[] args) {
		/*
		 * 10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
		 * empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
		 * vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e
		 * escrever o seu salário total.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salário fixo do vendedor: ");
		double salarioFixo = sc.nextDouble();

		System.out.print("Digite o valor das vendas do vendedor: ");
		double valorVendas = sc.nextDouble();

		double comissao = calcularComissao(valorVendas);
		double salarioTotal = salarioFixo + comissao;

		System.out.println("O salário total do vendedor é: R$" + salarioTotal);

		sc.close();
	}

	public static double calcularComissao(double valorVendas) {
		double comissao;
		if (valorVendas <= 1500) {
			comissao = valorVendas * 0.03;
		} else {
			comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
		}
		return comissao;
	}

}
