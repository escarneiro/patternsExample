package strategy;

public class Retangulo implements GeoForm{
	
	
	private int largura;
	private int altura;
	
	public Retangulo(int L, int A) {
		largura = L;
		altura = A;
	}
	
	
	public int getArea() {
		return largura*altura;
	}
}
