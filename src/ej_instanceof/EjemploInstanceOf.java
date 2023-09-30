package ej_instanceof;

public class EjemploInstanceOf {

	public static void main(String[] args) {
		Object obj = "Lalala";
		//ANTES
		if (obj instanceof String) {
		    String s = (String) obj;
		    // use s
		    System.out.println(s);
		}
		//AHORA
		if (obj instanceof String ss) {
		    // use s
			System.out.println(ss);
		}
	}
}
