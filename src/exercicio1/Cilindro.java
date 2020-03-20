package exercicio1;

public class Cilindro extends Poligono3D implements Volume {

	public Cilindro() {
	}

	public Cilindro(double raio, double altura) {
		super(raio, altura);
	}

	@Override
	public double volume() {
		return Math.pow(getRaio(), 2) * Math.PI * getAltura();
	}
}
