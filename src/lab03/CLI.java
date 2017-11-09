package lab03;

import java.util.Scanner;

public class CLI {
	
	private static Menu menuPadrao = new Menu(); 
	private static boolean opcaoSair = false;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(!opcaoSair) {
			 
			String opcao = new String();
			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air");
			System.out.printf("\nOpção> "); 
			
			opcao = sc.nextLine();
			switch (opcao) {
			case "C":	menuPadrao.cadastrarContato(); 
						break; 
			case "L":	menuPadrao.listarContatos();
						break;
			case "E":	menuPadrao.exibirContato();
						break;
			case "S":	opcaoSair = true;
						break;
			default:	System.out.println("OPÇÃO INVÁLIDA!");
			}
		}
		sc.close();
	}

}
