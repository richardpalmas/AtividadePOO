package atividadepoo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import atividadepoo.Conta;

/**
* @author Richard Palmas Ayres da Silva

*/


public class ContaTeste {

	Conta cont = new Conta();
	
	/**
	  Saldo da conta inexistente	  
	  Realiza-se o teste 
	 */
	
	@Test
	void testeSaca() {
		assertFalse(cont.saca(20));
	}
	/**
	* Realiza-se o teste para sacar com um saldo inicial
	
*/
	@Test
	void testSacaComSaldo() {
		cont.deposita(150);
		assertTrue(cont.saca(140));
	}
	/**
	 * A conta possui um saldo de $10 e o teste tentara transferir $20
	 * Realiza-se o teste
	 */

	@Test
	void testaTransfere() {
		Conta contadestino = new Conta();
		assertFalse(cont.transfere(contadestino, 20));
	}
	
	/** 
	 * Testa uma transferencia de $5
	 */


	@Test
	void testaTransfereComSaldo() {
		assertTrue(cont.transfere(new Conta(), 5));
	}
	/**	 
	 * Nomeia o propietario da conta para testar o retorno do metodo
	 * Realiza-se o teste
	 */

	@Test
	void testaNome() {
		cont.setNome("Richard");
		assertEquals("Richard",cont.getNome());
	}
	
	/**
	 * É esperado que este teste falher por conta da escrita do teste que pede
	 * que o valor retornado pelo metodo 'cont.getNome' seja diferente de Richard
	 * Realiza-se o teste
	 */
	
	@Test
	@DisplayName("Confirmar se o nome de usuário definido é diferente de Richard")
	void testaNomeFalse() {
		assertNotEquals("Richard", cont.getNome());
	}
	
}
