
public class Blablacar {

	
	
	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", "López", "Bernabé", 24, null);
		Persona persona2 = new Persona("Juan", "López", "Bernabé", 24, null);

		System.out.print("Persona1: ");
		persona1.describir();
		System.out.print("Persona2: ");
		persona2.describir();
		
		System.out.println(persona1 == persona2);
		
		// Persona persona3 = persona1;		

		Persona persona3 = new Persona(persona1);
		
		System.out.println(persona1 == persona3);
		
		persona3.setNombre("Antonio");

		System.out.print("Persona1: ");
		persona1.describir();
		System.out.print("Persona3: ");
		persona3.describir();

		Coche coche = new Coche("Opel", "Corsa", "1234CBD", 40000, null, 5);
		Persona juan = new Persona("Juan", "López", "García", 24, coche);
		
		coche.setPropietario(juan);
		
		System.out.println("//////////////////////////////////////////////////////////////////////");
	
		PoliticaBlablacar.getPoliticaPrecios(coche);
		
		Viaje murcia_madrid = new Viaje("Murcia", "Madrid", 400, coche);

		Persona persona4 = new Persona("Juan", "López", "Bernabé", 24, null);
		Persona persona5 = new Persona("Juan", "López", "Bernabé", 24, null);
		
		persona1.reservarViaje(murcia_madrid);
		persona2.reservarViaje(murcia_madrid);
		persona3.reservarViaje(murcia_madrid);
		persona4.reservarViaje(murcia_madrid);
		persona5.reservarViaje(murcia_madrid);
		
		int ganancias = PoliticaBlablacar.getGananciasTotales(murcia_madrid);
		
		System.out.println("Juan ganaría " + ganancias + " con este viaje");
		
	}

}
