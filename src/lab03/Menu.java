package lab03;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	private Agenda agendaPadrao = new Agenda();
	public void cadastrarContato() {
		int posicao;
		String nome;
		String sobrenome;
		String telefone;
		System.out.printf("\nPosição: ");
		posicao = sc.nextInt();
		sc.nextLine();
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
	public void listarContatos() {
		System.out.printf(agendaPadrao.listarContatos()); 
	}
	public void exibirContato() {
		int posicaoContato;
		System.out.printf("\nContato> ");
		posicaoContato = sc.nextInt();
		sc.nextLine();
		System.out.printf(agendaPadrao.pesquisaContato(posicaoContato));
	}
}
