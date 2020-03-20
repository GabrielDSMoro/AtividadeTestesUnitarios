package exercicio1;

public abstract class Poligono3D {

	private double raio, base, altura;

	public Poligono3D() {
	}

	public Poligono3D(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}

	public Poligono3D(double raio) {
		this.raio = raio;
	}
	
	public Poligono3D(double base, double altura, double raio) {
		this.setBase(base);
		this.setAltura(altura);
		this.setRaio(raio);
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
