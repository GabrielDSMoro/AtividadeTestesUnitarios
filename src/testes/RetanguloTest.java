package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.Retangulo;

class RetanguloTest {

	Retangulo ret;

	@BeforeEach
	void cria_Retangulo() {
		ret = new Retangulo(8, 5);

	}

	@Test
	void calcula_area_retangulo() {
		double area = ret.area();
		assertEquals(40, area);
	}

	@Test
	void calcula_area_retangulo_erro() {
		double area = ret.area();
		assertFalse(area == 40);
	}

	@Test
	void calcula_perimetro_retangulo() {
		double prmt = ret.perimetro();
		assertEquals(26, prmt);
	}

	@Test
	void calcula_perimetro_retangulo_erro() {
		double prmt = ret.perimetro();
		assertFalse(prmt == 26);

	}

	@Test
	void calcula_diagonal_retangulo() {
		double diag = ret.diagonal();
		assertEquals(9.433981132056603, diag);
	}

	@Test
	void calcula_diagonal_retangulo_erro() {
		double diag = ret.diagonal();
		assertTrue(diag == 12);
	}
	
	@AfterEach
	void limpaRetangulo() {
		ret = null;
	}
}
