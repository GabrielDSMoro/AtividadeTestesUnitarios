package exercicio1;

public class Circulo extends Figura implements Diagonal {

	private double raio;

	public Circulo() {
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.pow(raio, 2) * Math.PI;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public double diagonal() {
		return 2 * raio;
	}
}
