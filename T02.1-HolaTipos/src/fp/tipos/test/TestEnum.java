package fp.tipos.test;

import fp.tipos.Color;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c = Color.AMARILLO;
		System.out.println(c);
		
		Color c2 = Color.valueOf("VERDE");
		System.out.println(c2);

	}

}
