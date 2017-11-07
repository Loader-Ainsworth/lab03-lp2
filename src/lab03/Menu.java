package lab03;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Agenda agendaPadrao = new Agenda();
	private void cadastraContato() {
		int posicao;
		String nome;
		String sobrenome;
		String telefone;
		System.out.printf("\nPosição: ");
		posicao = sc.nextInt();
		System.out.printf("\nNome: ");
		nome = sc.nextLine(); 
		System.out.printf("\nSobrenome: ");
		sobrenome = sc.nextLine();
		System.out.printf("\nTelefone: ");
		telefone = sc.nextLine();
		if(agendaPadrao.cadastraContato(posicao, nome, sobrenome, telefone)) {
			System.out.println("CADASTRO REALIZADO!");
		} else {
			System.out.println("POSIÇÃO INVÁLIDA");
		}
	}
}
