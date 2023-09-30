package curso.takewhile;

import java.util.stream.Stream;

public class Iterate {

	/*
	iterate basicamente se comporta como un loop
	 */
	public static void main(String[] args) {
		Stream.iterate(1, i -> i <= 100, i -> 2 * i).forEach(System.out::println);
	}

}
