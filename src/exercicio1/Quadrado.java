package exercicio1;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado() {
	}

	public Quadrado(double base, double altura) {
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

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(super.getAltura(), 2) + Math.pow(super.getBase(), 2));
	}
}
