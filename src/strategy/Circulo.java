package strategy;

public class Circulo implements GeoForm {

	private int diametro;
	
	public Circulo(int D) {
		diametro = D;
	}
	
	public int getArea() {
		return (int) (Math.pow(diametro/2,2)*Math.PI);
	}
	
}
