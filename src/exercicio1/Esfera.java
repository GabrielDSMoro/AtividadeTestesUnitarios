package exercicio1;

public class Esfera extends Poligono3D implements Volume {

	public Esfera() {
	}

	public Esfera(double raio) {
		super(raio);
	}

	@Override
	public double volume() {
		return 4 * (Math.pow(getRaio(), 3) * Math.PI)/3;
	}
}
