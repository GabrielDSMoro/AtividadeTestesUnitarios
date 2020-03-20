package exercicio1;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo() {
	}

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return super.area();
	}

	@Override
	public double perimetro() {
		return 2 * super.getAltura() + 2 * super.getBase();
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
	}
}
