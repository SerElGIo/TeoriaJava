package fp.tipos;

public record Coordenadas(Double latitud, Double longitud) {
	//Contructor canónico - Esta definido por defecto
	//Atributos - No es necesario que los escriba. Se definan por defecto
	//Latitud y Lonmgitud
	//getters- No es necesarioo que los escriba. Estan definidos por defecto
	//latitud()
	//Longitud()
	
	public Double getDistanciaeuclidea(Coordenadas c) {
		Double difLat = c.latitud - latitud();
		Double difLon = c.longitud - longitud();
		return Math.sqrt(difLat*difLat + difLon*difLon);
	}
	
	public Double getDistanciaHaversine(Coordenadas c) {
		//Tarea
		//definir una constante para el radio de la tierra
		return null;
	}
}
