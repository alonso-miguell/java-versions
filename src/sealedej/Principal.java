package sealedej;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		System.out.println("SEALED: " + Shape.class.isSealed());
		System.out.println("PERMITTED SUBCLASSES: " + Arrays.toString(Shape.class.getPermittedSubclasses()));
		Class[] lista= Shape.class.getPermittedSubclasses();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("SEALED: " + Circle.class.isSealed());
		System.out.println("HIDDEN: " + Circle.class.isHidden());
	}

}
