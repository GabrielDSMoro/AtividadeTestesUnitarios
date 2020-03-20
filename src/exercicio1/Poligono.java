package exercicio1;

public abstract class Poligono extends Figura {

	private double base;
	private double altura;

	public Poligono() {
	}

	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Poligono(double base) {
		base = this.base;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

}
