package main;
import java.util.Scanner;

import usuario.Usuario;

public class SAC {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Digite nome do cliente: ");
		String nome = key.nextLine();
		System.out.print("Digite id do cliente: ");
		int id = key.nextInt();
		Usuario cliente = new Usuario(id, nome);
		int opcao;

		do {
			System.out.println(" \n 0 - para sair do sistema.\r\n" + " 1 - para enviar mensagem de feedback.\r\n"
					+ " 2 - ler e responder mensagem de feedback.\r\n");
			System.out.print("Digite op��o: ");	

			opcao = key.nextInt();
			switch (opcao) {

			case 0:
				System.out.println("\nFinalizado o atendimento...");
				break;
			case 1:
				System.out.print("\nDigite mensagem a ser enviada: ");
				key.nextLine();
				String msg = key.nextLine();
				cliente.enviaMsg(msg);
				break;
			case 2:
				if (cliente.getStatus() == "N�o ok")
					cliente.leMsg();
				else
					System.out.println("\nN�o h� mensagens de feedback.");
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
			}

		} while (opcao != 0);

		key.close();
	}

}
