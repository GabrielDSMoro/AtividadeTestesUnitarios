package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.Quadrado;

class QuadradoTest {

	Quadrado quadra;

	@BeforeEach
	void cria_Quadrado() {
		quadra = new Quadrado(5, 5);
	}

	@Test
	void calcula_area_quadrado() {
		double area = quadra.area();
		assertEquals(25, area);
	}

	@Test
	void calcula_area_quadrado_erro() {
		double area = quadra.area();
		assertFalse(area == 25);

	}

	@Test
	void calcula_perimetro_quadrado() {
		double prmt = quadra.perimetro();
		assertEquals(20, prmt);
	}

	@Test
	void calcula_perimetro_quadrado_erro() {
		double prmt = quadra.perimetro();
		assertFalse(prmt == 20);
	}

	@Test
	void calcula_diagonal_quadrado() {
		double diag = quadra.diagonal();
		assertEquals(7.0710678118654755, diag);
	}

	@Test
	void calcula_diagonal_quadrado_erro() {
		double diag = quadra.diagonal();
		assertFalse(diag == 7.0710678118654755);
	}
	
	@AfterEach
	void limpaQuadrado() {
		quadra = null;
	}

}
