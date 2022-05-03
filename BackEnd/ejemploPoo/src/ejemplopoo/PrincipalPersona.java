
package ejemplopoo;


import ejemplopoo.Persona;
import java.util.ArrayList;



public class PrincipalPersona {
    
    public static ArrayList<Persona> integrantes = new ArrayList<Persona>();
    
     public static void main(String[] args) {
         
          //Creamos  personas de distintas maneras 
        
        Persona Juan = new Persona();
        Persona Delia = new Persona(2, "Delia", "Gracia", "15/05/1970", "d@gmail.com", "Arquitecta", "Freelancer", "argentina", "La Pampa");
        Persona Marcos = new Persona(3, "Marcos", "Perez", "12/06/1950", "mp@gmail.com", "Dr", "Jefe Hospital", "Argentino", "Córdoba");
        Persona Maria = new Persona(4, "Maria", "Diaz", "12/10/1946", "md@gmail.com", "Contadora", "Municipalidad Local", "Argentina", "Córdoba");
        
        
      
        // Armamos la lista de personas
        
         System.out.println("Mostramos la lista de personas creadas" + "\n");
         integrantes.add(Juan);
         integrantes.add(Delia);
         integrantes.add(Marcos);
         integrantes.add(Maria);
          for (int i=1;i<integrantes.size();i++) {
      
        System.out.println(integrantes.get(i) + "\n");
    }
        
         
         
        
        //Mostramos personas mediante toString
        System.out.println("Mostramos datos mediante toString : ");
        System.out.println(Marcos.toString() + "\n");
        
       
        // Listar nombre y apellido  mediante Método ListarNombre
           Maria.ListarNombre(Maria);

       
        
        
        //Mostraremos los datos de la persona por pantalla mediante llamada al método mostrar
        
          String datos = Juan.MostrarDatos(1, "Juan", "Ortiz", "15/05/1970", "Jo@gmail.com", "Abogado", "Estudio Juridico", "Urguayo", "La Paloma");
          System.out.println("Mostramos datos mediante el método mostrar : ");
          System.out.println("Nueva Persona");
             System.out.println(datos);
          
              };
          
     
        
       
}
