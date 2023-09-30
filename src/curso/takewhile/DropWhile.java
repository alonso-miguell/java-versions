package curso.takewhile;

import java.util.stream.Stream;

public class DropWhile {

	/*
	DropWhile descartará los elementos hasta que no se cumpla la condicion

	salida: def ya que despues de de se rompe el condicional
	 */

	public static void main(String[] args) {
		Stream.of("a", "b", "c", "de", "f").dropWhile(s -> s.length() <= 1).forEach(System.out::print);	
	}

}
