
package ejercitacionpoo;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

        public Entrenador() {
		super();
	}

    public Entrenador(int id, String Nombre, String Apellidos, int Edad, String idFederacion) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    

   	

	public void dirigirPartido() {
		System.out.println("Dirige partido");	
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige entrenamiento");
	}
    
}
