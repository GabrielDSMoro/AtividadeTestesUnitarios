package exercicio1;

public class Piramide extends Poligono3D implements Volume {

	public Piramide() {
	}

	public Piramide(double base, double altura,double raio) {
		super(base, altura,raio);
	}

	@Override
	public double volume() {
		return (getAltura() * Math.pow(getBase(), 2)) * 1 / 3;
	}

}
