package curso.takewhile;

import java.util.stream.Stream;

public class TakeWhile {

	/*
	TakeWhile procesara lso elementos hasya que la condicion ya no se cumpla
	 */

	public static void main(String[] args) {
		Stream.of("a", "b", "c", "", "e").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
	}

}
