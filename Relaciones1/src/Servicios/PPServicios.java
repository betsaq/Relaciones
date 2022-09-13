package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class PPServicios {

    private final Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona pers = new Persona();

        System.out.println("Ingrese nombre de la persona");
        pers.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido de la persona");
        pers.setApellido(leer.nextLine());
        System.out.println("Ingrese edad de la persona");
        pers.setEdad(leer.nextInt());
        System.out.println("Ingrese DNI de la persona");
        pers.setDocumento(leer.nextInt());
       

        return pers;

    }

    public Perro crearPerro() {

        Perro perris = new Perro();

        System.out.println("Ingrese nombre del perro");
        perris.setNombre(leer.nextLine());
        System.out.println("Ingrese raza del perro");
        perris.setRaza(leer.nextLine());
        System.out.println("Ingrese edad del perro");
        perris.setEdad(leer.nextInt());
        System.out.println("Ingrese tamanio del perro");
        perris.setTamanio(leer.nextLine());

        return perris;

    }

}
