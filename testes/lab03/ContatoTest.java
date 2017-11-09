package lab03;

import static org.junit.Assert.*;

import org.junit.*;

public class ContatoTest {

	private Contato contatoBasico;
	
	@Before
	public void criaContato() {
		contatoBasico = new Contato("Matheus", "Gaudencio", "0000-0000");
	}
	@Test
	public void testNomeCompleto() {
		String msg = "Esperando obter o nome completo";
		assertEquals(msg, "Matheus Gaudencio", contatoBasico.nomeCompleto());
	}

}
