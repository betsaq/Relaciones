package Service;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    Scanner leer = new Scanner(System.in);

    public Baraja crearMazo() {

        Baraja Baraj = new Baraja();
        ArrayList<Carta> tmpMazo = new ArrayList();

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {

                Carta car1 = new Carta();
                car1.setNumero(i);
                car1.setPalo("oro");
                tmpMazo.add(car1);
            }
        }

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {

                Carta car1 = new Carta();
                car1.setNumero(i);
                car1.setPalo("espada");
                tmpMazo.add(car1);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {

                Carta car1 = new Carta();
                car1.setNumero(i);
                car1.setPalo("basto");
                tmpMazo.add(car1);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {

                Carta car1 = new Carta();
                car1.setNumero(i);
                car1.setPalo("copa");
                tmpMazo.add(car1);
            }
        }
        Baraj.setMazo(tmpMazo);
//para mostrar el mazo creado
//        for(Carta Carta: tmpMazo){
//          System.out.println(Carta);
//        }
        return Baraj;
    }

//• barajar(): cambia de posición todas las cartas aleatoriamente.
    public Baraja barajar(Baraja barajaInicial) {
        //crear arraytemporal con el mazo

        ArrayList<Carta> tmpMazo = new ArrayList();
        tmpMazo = barajaInicial.getMazo();
        //mezclarlo 
        Collections.shuffle(tmpMazo);
        //setear mazo mezclado en el objeto
        barajaInicial.setMazo(tmpMazo);

        //lo muestro
        System.out.println("-------------BARAJA COMPLETA-------------------------");
        for (Carta carta : tmpMazo) {
            System.out.println(carta);
        }

        return barajaInicial;
    }

//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
//más o se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(Baraja barajaInicial) {
        ArrayList<Carta> tmpMazo = new ArrayList();
        tmpMazo = barajaInicial.getMazo();

        Carta C1 = tmpMazo.get(0);
        System.out.println(C1);
        int contador = 0;
        for (Carta carta : tmpMazo) {
            contador--;

        }
        if (contador > 0) {
            System.out.println("No hay mas cartas");
        }
    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(Baraja barajaInicial) {

        ArrayList<Carta> tmpMazo = new ArrayList();
        tmpMazo = barajaInicial.getMazo();

        int contador = 0;
        for (Carta carta : tmpMazo) {
            contador++;

        }
        System.out.println("--------CARTAS ACTUALMENTE DISPONIBLES: -------->" + contador);
    }

    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
//de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
//nada, pero debemos indicárselo al usuario.
    public Baraja darCartas(Baraja barajaInicial) {
        ArrayList<Carta> tmpPozo = new ArrayList();
        ArrayList<Carta> tmpMazo = new ArrayList();

        System.out.print("Cuantas cartas desea mostrar?: ");
        int cantidad = leer.nextInt();

        if (cantidad <= barajaInicial.getMazo().size()) {

            tmpMazo = barajaInicial.getMazo();

            for (int i = 0; i < cantidad; i++) {
                Carta C1 = tmpMazo.get(i);
                System.out.println(C1);
                
                tmpPozo.add(tmpMazo.get(i));
                tmpMazo.remove(i);
            }

        } else {
            System.out.println("No hay suficientes cartas en el mazo para repartir la cantidad deseada");
        }
        barajaInicial.setMazo(tmpMazo);
        barajaInicial.setPozo(tmpPozo);

        return barajaInicial;

    }

    //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(Baraja barajaInicial) {
        ArrayList<Carta> tmpPozo = new ArrayList();
        tmpPozo = barajaInicial.getPozo();

        if (barajaInicial.getPozo().size() >= 0) {

            for (Carta carta : tmpPozo) {
                System.out.println("Cartas que ya han salido: "
                        + carta);
            }
        } else {
            System.out.println("No ha salido ninguna carta");

        }

    }

    //• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
//y luego se llama al método, este no mostrara esa primera carta.
    public Baraja mostrarBaraja(Baraja barajaInicial) {
        ArrayList<Carta> tmpMazo = new ArrayList();
        tmpMazo = barajaInicial.getMazo();
        for (Carta carta : tmpMazo) {
            System.out.println(carta);
        }
        return barajaInicial;
    }

}
