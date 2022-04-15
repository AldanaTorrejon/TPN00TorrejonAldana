package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00TorrejonAldanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00TorrejonAldanaApplication.class, args);
		String nombre = "Aldana";
		System.out.println("Hola mundo, dice "+ nombre + " " + darNombre());
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44815375");
		unEstudiante.setNombre("Aldana");
		unEstudiante.setApellido("Torrejon");
		System.out.println("El estudiante "+ unEstudiante.getNombre() +" "+ unEstudiante.getApellido() + " dice HOLA:)");
			
		Calculadora unCalculadora = new Calculadora(); 
		unCalculadora.sentN1(8);
		unCalculadora.sentN2(5);
		System.out.println("El resultado de la suma es " + unCalculadora.sumaNumero());
		System.out.println("El resultado de la resta es " + unCalculadora.restNumero());
		System.out.println("El resultado de la division es " + unCalculadora.divisionNumero());
		System.out.println("El resultado de la multiplicacion es " + unCalculadora.multiplicacionNumero());
		System.out.println("El resultado de la potencia es " + unCalculadora.potenciaNumero());
		System.out.println("El resultado de la raiz " + unCalculadora.raizNumero());
	}
	public static String darNombre() {
		String nuevoNombre = "Torrejon";
		return nuevoNombre;	
	}
}
