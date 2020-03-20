package exercicio1;

import java.util.ArrayList;

public class Geometria {
	public static void main(String args[]) {
		ArrayList<Figura> lista = new ArrayList<Figura>();

		lista.add(new Circulo(3));
		lista.add(new Retangulo(8, 5));
		lista.add(new Quadrado(5, 5));
		lista.add(new Losango(4, 6));
		lista.add(new Triangulo(4, 7));

		for (Figura e : lista) {
			System.out.println("Área: " + e.area() + " Perímetro: " + e.perimetro());
		}

		System.out.println("=================================");
		ArrayList<Diagonal> diag = new ArrayList<Diagonal>();

		diag.add(new Quadrado(5, 5));
		diag.add(new Retangulo(5, 8));
		for (Diagonal d : diag) {
			System.out.println("Diagonal: " + d.diagonal());
		}
		System.out.println("=================================");

		ArrayList<Volume> vol = new ArrayList<Volume>();

		vol.add(new Cilindro(2, 3));
		vol.add(new Piramide(4, 9, 0));
		vol.add(new Esfera(8));
		vol.add(new Cubo(3, 0, 0));

		for (Volume v : vol) {
			System.out.println("Volume: " + v.volume());
		}
	}
}
