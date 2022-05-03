
package ejemplopoo;

import java.util.ArrayList;
import java.util.List;


public class Persona {
    protected int idPersona;
    protected String nombre;
    protected String apellido;
    protected String FecNacimiento; 
    protected String mail; 
    protected String Ocupacion; 
    protected String info; 
    protected String nacionalidad; 
    protected String domicilio;
    
    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String FecNacimiento, String mail, String Ocupacion, String info, String nacionalidad, String domicilio) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FecNacimiento = FecNacimiento;
        this.mail = mail;
        this.Ocupacion = Ocupacion;
        this.info = info;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
    }

    

    

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecNacimiento() {
        return FecNacimiento;
    }

    public void setFecNacimiento(String FecNacimiento) {
        this.FecNacimiento = FecNacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

  
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", FecNacimiento=" + FecNacimiento + ", mail=" + mail + ", Ocupacion=" + Ocupacion + ", info=" + info + ", nacionalidad=" + nacionalidad + ", domicilio=" + domicilio + '}';
    }
     
    
     
   public String MostrarDatos(int idPersona, String nombre, String apellido, String FecNacimiento, String mail, String info, String ocupacion, String nacionalidad, String domicilio){
   String cadena = "";
   
   cadena += "idPersona = " + idPersona + "\n";  
   cadena += "Nombre= " + nombre + "\n";
   cadena += "apellido = " + apellido + "\n";
   cadena += "FecNacimiento = " + FecNacimiento + "\n";
   cadena += "mail = " + mail + "\n";
   cadena += "info = " + info + "\n"; 
   cadena += "ocupacion = " + ocupacion + "\n";
   cadena += "nacionalidad = " + nacionalidad + "\n";
   cadena += "domicilio = " + domicilio + "\n";
        
   return cadena;
}
   
   
   
  public void ListarNombre(Persona persona) {
       System.out.print("Mostramos datos mediante método Listar Nombre y apellido :" + "\n");
      
       System.out.println("El nombre de la persona es: " + persona.getNombre());
       System.out.println("Su apellido: " + persona.getApellido() + "\n");
      
  }
   
  
  
}
