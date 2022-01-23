package strategy;

public class Triangulo implements GeoForm{

	private int altura;
	private int base;
	
	public Triangulo(int H, int B) {
		altura = H;
		base   = B;
	}
	
	public int getArea() {
		return (base*altura)/2;
	}
	
	
}
