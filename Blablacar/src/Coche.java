
public class Coche {

	private String marca;
	private String modelo;
	private String matricula;
	private int km;
	private Persona propietario;
	private int n_plazas;
	
	public Coche(String marca, String modelo, String matricula, int km, Persona propietario, int n_plazas) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.km = km;
		this.propietario = propietario;
		this.n_plazas = n_plazas;
	}
	
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	public int getKm() {
		return km;
	}
	
	public int getN_plazas() {
		return n_plazas;
	}
}
