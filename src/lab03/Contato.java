package lab03;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	public String nomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

	public String getTelefone() {
		return this.telefone;
	}
}
