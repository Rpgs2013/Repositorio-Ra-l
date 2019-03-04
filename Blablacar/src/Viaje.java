
public class Viaje {
	private String origen;
	private String destino;
	private int distancia;
	private Coche coche;
	private int plazas_disponibles;
	
	public Viaje(String origen, String destino, int distancia, Coche coche) {
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.coche = coche;
		this.plazas_disponibles = coche.getN_plazas() - 1;
	}
	
	public boolean ocuparPlaza() {
		if(plazas_disponibles > 0){
			plazas_disponibles--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Coche getCoche() {
		return coche;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public int getPlazasOcupadas() {
		return coche.getN_plazas() - 1 - plazas_disponibles; 
	}
}
