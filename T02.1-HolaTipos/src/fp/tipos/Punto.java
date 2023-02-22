package fp.tipos;

public interface Punto {
	
	/**
	 * @return  El valor de la coordenada X del punto
	 */
	Double getX();
	/**
	 * @return  El valor de la coordenada Y del punto
	 */
	Double getY();
	
	
	//Metodos modificadores
	
	/**
	 * @param nuevaX Nueva x del punto
	 */
	void setX(Double nuevaX);
	/**
	 * @param nuevaY Nueva Y del punto
	 */
	void setY(Double nuevaY);
	
	/**
	 * @param p Punto al que queremos calcular la distancia
	 * @return Valor de la distancia entre los dos puntos
	 */
	Double getDistancia(Punto p);
	
	
}
