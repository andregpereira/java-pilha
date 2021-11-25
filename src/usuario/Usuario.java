package usuario;

import pilhaMensagens.PilhaMensagens;

public class Usuario {

	private PilhaMensagens feedback;
	private int id;
	private String nome;
	private String status;

	public Usuario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		feedback = new PilhaMensagens();
		this.status = "Ok";
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void enviaMsg(String msg) {
		feedback.push(msg);
		this.status = "Não ok";
	}

	public void leMsg() {
		while (feedback.isEmpty() != true) {
			System.out.println("\nMensagem enviada: " + feedback.pop());
			System.out.println("\t\t  Problema resolvido");
		}

		status = "Ok";
	}

	public String getStatus() {
		return status;
	}

}
