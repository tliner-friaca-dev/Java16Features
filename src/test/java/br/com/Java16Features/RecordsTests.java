package br.com.Java16Features;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecordsTests {

	@Test
	void recordsBlocks_retornaObjetoRecords_quandoSucesso() {
		var usuario = new Usuario(1L, "Ronaldo", new BigDecimal("10"), Usuario.ATIVO);
		assertAll("usuario", () -> assertEquals(1, usuario.id()),
								() -> assertEquals("Ronaldo", usuario.nome()),
								() -> assertEquals(10.0, usuario.valor()),
								() -> assertEquals(Boolean.TRUE, usuario.status())
					);
	}

	@Test
	void recordsBlocks_retornaAPropriedadeStatusDaRecords_quandoSucesso() {
		var usuario = new Usuario(1L, "Ronaldo", new BigDecimal("10"), Usuario.ATIVO);
		var resultado = usuario.statusLabel();
		assertEquals("Ativo", resultado);
	}
}
