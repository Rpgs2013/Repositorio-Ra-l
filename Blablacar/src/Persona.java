
public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private Coche coche;
	private Viaje viaje;
	
	public Persona(String nombre, String apellido1, String apellido2, int edad, Coche coche) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.coche = coche;
		this.viaje = null;
	}
	
	
	public Persona(Persona persona_a_copiar) {
		this.nombre = persona_a_copiar.nombre;
		this.apellido1 = persona_a_copiar.apellido1;
		this.apellido2 = persona_a_copiar.apellido2;
		this.edad = persona_a_copiar.edad;
		this.coche = null;
	}
	
	public void describir() {
		String descripcion = "";
		
		descripcion += nombre + " " + apellido1 + " " + apellido2
				+ ". Edad: " + edad + " años.";  
		
		System.out.println(descripcion);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean igual(Persona persona) {
		return (this.nombre == persona.nombre && 
				this.apellido1 == persona.apellido1 &&
				this.apellido2 == persona.apellido2 &&
				this.edad == persona.edad);		 
	}
	
	public void reservarViaje(Viaje viaje) {
		if(viaje.ocuparPlaza()) {
			this.viaje = viaje;
		} else {
			System.out.println("Lo siento, no hay plazas disponibles");
		}
	}
	
}
