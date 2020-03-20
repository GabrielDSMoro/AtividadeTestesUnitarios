package exercicio1;

public class Losango extends Poligono {

	public Losango() {
	}

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return super.area();
	}

	@Override
	public double perimetro() {
		return 4 * super.getBase();
	}
}
