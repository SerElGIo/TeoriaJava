package fp.tipos;

public class PuntoImpl implements Punto {
	//Atributos 
	private Double x;
	private Double y;
	
	
	//Constructores
	public PuntoImpl() {//Constructor por defecto
		y= 0.0;
		x= 0.0;		
	}
	
	public PuntoImpl(Double x, Double y) {//Constructor con 2 parametros
		this.y=y;
		this.x=x;		
	}
	public PuntoImpl(Double x) {//Constructor con 2 parametros
		y=0.0;
		this.x=x;		
	}
	
	

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	//Modificadores
	public void setX(Double nuevaX) {
		this.x = nuevaX;
	}

	public void setY(Double nuevaY) {
		this.y = nuevaY;
	}

	public Double getDistancia(Punto p) {
		Double difX = p.getX() - this.getX();
		Double difY = p.getY() - this.getY();
		
		return Math.sqrt((difX*difX + difY*difY));
	}

	//representacion como cadena
	public String toString(){
		return "(" + this.getX() + "," + this.getY() + ")";
		
		
	}
	
}
