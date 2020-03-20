package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.Triangulo;

class TrianguloTest {

	Triangulo tri;

	@BeforeEach
	void criaTriangulo() {
		tri = new Triangulo(2, 6);
	}

	@Test
	void test_area_triangulo() {
		double area = tri.area();
		assertFalse(area != 6);
	}

	@Test
	void test_area_triangulo_erro() {
		double area = tri.area();
		assertEquals(3, area);
	}
	
	@Test
	void test_perimetro_triangulo() {
		double prmt = tri.perimetro();
		assertTrue(prmt == 6);
	}
	
	@Test
	void test_perimetro_triangulo_erro() {
		double prmt = tri.perimetro();
		assertEquals(0,prmt);
	}
	
	@AfterEach
	void limpaTriangulo() {
		tri = null;
	}

}
