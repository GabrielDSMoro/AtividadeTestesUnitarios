package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.Circulo;

class CirculoTest {

	Circulo circ;

	@BeforeEach
	void cria_Circulo() {
		circ = new Circulo(3);
	}

	@Test
	void calcula_area_circulo() {
		double area = circ.area();
		assertEquals(28.274333882308138, area);
	}

	@Test
	void calcula_area_circulo_erro() {
		double area = circ.area();
		assertFalse(area != 9.237187381783);
	}

	@Test
	void calcula_perimetro_circulo() {
		double prmt = circ.perimetro();
		assertTrue(prmt == 18.84955592153876);
	}

	@Test
	void calcula_perimetro_circulo_erro() {
		double prmt = circ.perimetro();
		assertEquals(81.235245, prmt);
	}

	@Test
	void calcula_diagonal_circulo() {
		double diag = circ.diagonal();
		assertTrue(diag == 6);
	}

	@Test
	void calcula_diagonal_circulo_erro() {
		double diag = circ.diagonal();
		assertFalse(diag == 6);
	}

	@AfterEach
	void limpa_Circulo() {
		circ = null;
	}
}
