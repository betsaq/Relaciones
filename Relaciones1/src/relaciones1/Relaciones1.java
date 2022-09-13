//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.
package relaciones1;

import Entidades.Persona;
import Entidades.Perro;
import Servicios.PPServicios;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Relaciones1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PPServicios Service = new PPServicios();

        List<Persona> personas = new ArrayList();
        List<Perro> perrosadoptables = new ArrayList();
        
        
        //cargamos las personas al sistema
        System.out.println("CARGA DATOS PERSONAS");
        for (int i = 0; i < 2; i++) {
            personas.add(Service.crearPersona());
        }

        //cargamos los perros al sistema
        System.out.println("CARGA DATOS PERROS");
        for (int i = 0; i < 2; i++) {
            perrosadoptables.add(Service.crearPerro());
        }

        for (Persona aux : personas) {
            System.out.println("Seleccione el perro a adoptar para : " + aux.getNombre() + " " + aux.getApellido() );
            for (Perro aux2 : perrosadoptables) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();

            int contador = 0;
            for (int i = 0; i < perrosadoptables.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosadoptables.get(i).getNombre())) {
                    aux.setPerro(perrosadoptables.get(i));
                    contador++;
                    perrosadoptables.remove(i);
                }
            }
            if (contador == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        
        
        
       
    }

}
