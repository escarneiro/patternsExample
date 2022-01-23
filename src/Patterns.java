
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import singleton.*;
import strategy.*; 
import facade.*;


public class Patterns {

	public static void main(String[] args) throws IOException {
		
		FileClass fc = FileClass.getInstance();
		
		/**
		 * 
		 * Exemplo de aplicação de Singleton: 
		 * Duas threads escrevendo em um mesmo arquivo 
		 * - que não poderia ser aberto duas vezes.
		 * 
		 * Poderia ser usado por exemplo em
		 * uma aplicação que gera logs.
		 * 
	    */
		RunnableClass R1 = new RunnableClass(fc, "Thread 1\n");
		RunnableClass R2 = new RunnableClass(fc, "Thread 2\n");		
		R1.run();
		R2.run();		
		fc.closeFile();
		
		
		/**
		 * Exemplo de aplicação de Strategy. 
		 * Inclusive, o próprio uso de List <> ArrayList já  
		 * também uma aplicação deste mesmo design Pattern
		 * 
		 * 
		 * Posso criar uma lista com diferentes objetos,
		 * e imprimir a área de cada um sem precisar saber
		 * qual a formula especifica de cada.
		 * 
		 */
		List<GeoForm> geoForm = new ArrayList<GeoForm>();
		
		geoForm.add(new Retangulo(10, 20));
		geoForm.add(new Triangulo(10, 20));
		geoForm.add(new Circulo(10));
		
		for(GeoForm f: geoForm) {
			System.out.println("Área do "+f.getClass()+": "+f.getArea());
		}
		
		
		/**
		 *  Exemplo de aplicalção de Facade.
		 *  Desejo realizar algumas operações matematicas
		 *  diferentes, que estariam em classes diferentes,
		 *  mas que podem ser acessadas por uma só.
		 *  
		 *  Facilita a manutenção e uso por parte
		 *  de quem faz uso dos serviços/API
		 *  
		 *  
		 */
		
		MathOps mo = new MathOps();
		System.out.println("Fatorial de 6: "+ mo.Fatorial(6));
		System.out.println("Raiz Quadrada de 6: "+ mo.SquareRoot(6));
		System.out.println("Segunda Potencia de 6: "+mo.Power(6));
		
		
		
	}

}
