package facade;

public class MathOps {
	
	/*
	 * Aqui vamos reunir o conteudo das demais classes do
	 * pacote em um só lugar.
	 * 
	 */
	
	
	public static float SquareRoot(float x) {
		return SquareRoot.doSquareRoot(x);
	}
	
	public static float Power(float x) {
		return Power.doPower(x);
	}
	

	public static float Fatorial(int x) {
		return Fatorial.doFatorial(x);
	}
}
