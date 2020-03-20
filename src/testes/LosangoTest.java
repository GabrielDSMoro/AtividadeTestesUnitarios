package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.Losango;

class LosangoTest {

	Losango log;

	@BeforeEach
	void criaLosango() {
		log = new Losango(2, 4);
	}

	@Test
	void test_area_losango() {
		double area = log.area();
		assertEquals(8, area);

	}

	@Test
	void test_area_losango_erro() {
		double area = log.area();
		assertTrue(area == 10);
	}

	@Test
	void test_perimetro_losango() {
		double prmt = log.perimetro();
		assertFalse(prmt != 8);
	}

	@Test
	void test_perimetro_losango_erro() {
		double prmt = log.perimetro();
		assertTrue(prmt == 23);
	}

	@AfterEach
	void limpaLosango() {
		log = null;
	}

}
