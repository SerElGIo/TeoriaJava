package fp.tipos.test;

import fp.tipos.Coordenadas;

public class testCoordenadas {

	public static void main(String[] args) {
		Coordenadas c1 = new Coordenadas(1.0464, -3.33);
		System.out.println(c1);
		
		Coordenadas c2 = new Coordenadas(3.333, 14.32456);
		System.out.println(c1.getDistanciaeuclidea(c2));
		

	}

}
