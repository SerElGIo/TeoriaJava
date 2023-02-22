package fp.tipos.test;

import fp.tipos.Punto;
import fp.tipos.PuntoImpl;

public class TestPunto {

	public static void main(String[] args) {
		Punto p1 = new PuntoImpl();
		System.out.println(p1);
		
		Punto p2 = new PuntoImpl(2.1, -3.4);
		System.out.println(p2);
		System.out.println("La distancia entre" + p1 + " y " + p2 + " es:");
		System.out.println(p1.getDistancia(p2));
		
	}

}
