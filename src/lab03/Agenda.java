package lab03;

public class Agenda {

	private Contato[] listaDeContatos = new Contato[100];
	
	private boolean posicaoEhValida(int posicao) {
		if(posicao < 1 || posicao > 100) {
			return false;
		}
		return true;
	}
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		if(!posicaoEhValida(posicao)) {
			return false;
		} else {
			this.listaDeContatos[posicao-1] = new Contato(nome, sobrenome, telefone);
		}
		return true;
	}
	public String pesquisaContato(int posicao) {
		if(!posicaoEhValida(posicao) || listaDeContatos[posicao-1] == null) {
			return "POSIÇÃO INVÁLIDA!";
		}
		return String.format("%s - %s\n", this.listaDeContatos[posicao-1].nomeCompleto(), this.listaDeContatos[posicao-1].getTelefone());
	}
	public String listarContatos() {
		String retorno = new String();
		for(int i = 0; i < 100; i++) {
			if (listaDeContatos[i] != null){
				retorno += String.format("%d - %s\n", (i+1), this.listaDeContatos[i].nomeCompleto()); 
			}
		}
		return retorno;
	}
}
