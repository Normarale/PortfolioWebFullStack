
package ejercitacionpoo;

import java.util.ArrayList;
import ejercitacionpoo.Entrenador;
import ejercitacionpoo.Futbolista;
import ejercitacionpoo.Masajista;
import ejercitacionpoo.SeleccionFutbol;

public class EjercitacionPOO {

   
   // ArrayList de objetos SeleccionFutbol.
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		Entrenador Gallardo = new Entrenador(1, "Marcelo", "Gallardo", 46, "284EZ89");
		Futbolista Suarez = new Futbolista(2, "Matias", "Suarez", 33, 7, "Delantero");
		Masajista Sapienza = new Masajista(3, "Marcelo", "Sapienza", 41, "masoterapeuta", 18);

		integrantes.add(Gallardo);
		integrantes.add(Suarez);
		integrantes.add(Sapienza);

		// CONCENTRACION
		System.out.println("Todos los integrantes concentran )");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Concentrarse();
		}
		
		// VIAJE
		System.out.println("\nTodos viajan para jugar un partido)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Viajar();
		}
		
		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista :");
		System.out.print(Gallardo.getNombre()+" "+ Gallardo.getApellidos()+" -> ");
		Gallardo.dirigirEntrenamiento();
		System.out.print(Suarez.getNombre()+" "+Suarez.getApellidos()+" -> ");
		Suarez.entrenar();
		
		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(Sapienza.getNombre()+" "+Sapienza.getApellidos()+" -> ");
		Sapienza.darMasaje();
		
		// PARTIDO DE FUTBOL
		System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista :");
		System.out.print(Gallardo.getNombre()+" "+Gallardo.getApellidos()+" -> ");
		Gallardo.dirigirPartido();
		System.out.print(Suarez.getNombre()+" "+Suarez.getApellidos()+" -> ");
		Suarez.jugarPartido();
	}
    
}
