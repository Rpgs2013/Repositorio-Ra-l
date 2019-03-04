
public class PoliticaBlablacar {
	
	public static int getPrecioCoche(Coche coche){
		int km = coche.getKm();
		
		if(km < 20000) {
			return 5;
		} else if (km < 40000) {
			return 4;
		} else {
			return 2;
		}
	}
	
	public static void getPoliticaPrecios(Coche coche) {
		int precio = getPrecioCoche(coche);
		
		System.out.println("Tu coche tiene un kilometraje de " + coche.getKm()
		+ "\nEl precio por persona cada 100km es de " + precio);
	}
	
	public static int getPrecioViaje(Viaje viaje) {
		int precio = 0;
		int distancia = viaje.getDistancia();
		int precio_por_plaza = getPrecioCoche(viaje.getCoche());
		
		precio = (distancia/100) * precio_por_plaza;
		
		return precio;
	}
	
	public static int getGananciasTotales(Viaje viaje) {
		int ganancias = 0;
		
		ganancias = getPrecioViaje(viaje) * viaje.getPlazasOcupadas();
		
		return ganancias;
	}
	
}
