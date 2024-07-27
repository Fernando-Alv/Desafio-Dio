package Contas;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Digite o número da agencia");
		String numeroAgencia = sc.nextLine();
		
		System.out.println("Qual tipo de conta você deseja abrir [Poupança, Corrente]: ");
		String tipoConta = sc.nextLine();
		
		Random random = new Random();
		int numeroConta = random.nextInt((9000000 - 1000) + 1) + 1000;
		
		System.out.println("Sua conta foi criada com sucesso!");
		System.out.println("Nome do titular da conta: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Agência: " + numeroAgencia);
		System.out.println("Numero da conta: " + numeroConta);
		
		sc.close();
	}
				
}
