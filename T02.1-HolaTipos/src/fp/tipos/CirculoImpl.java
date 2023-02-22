package fp.tipos;

public class CirculoImpl {
	private static final double PI = 3.1415;
	private Double radio;
	private Punto centro;
		
	public CirculoImpl() {
		this.radio = 1.0;
		this.centro = new PuntoImpl();
	}
	public CirculoImpl(Double radio, Punto centro) {
		this.radio = 1.0;
		this.centro = new PuntoImpl();
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public Double getArea() {
		return PI*Math.pow(getRadio(), 2);
	}
	public Double getLongitud() {
		return getArea()*2;
	}
	
	
	
	
}
