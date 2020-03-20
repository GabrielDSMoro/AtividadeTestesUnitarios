package exercicio1;

public class Cubo extends Poligono3D implements Volume {

	public Cubo() {
	}

	public Cubo(double base,double altura, double raio) {
		super(base,altura,raio);
	}

	@Override
	public double volume() {
		return Math.pow(getBase(), 3);
	}

}
