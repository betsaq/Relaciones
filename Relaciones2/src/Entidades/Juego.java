//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver
//Métodos:
package Entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver R;

    public Juego() {
    }

    public Juego(Revolver R, ArrayList<Jugador> jugadores) {
        this.R = R;
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return R;
    }

    public void setR(Revolver R) {
        this.R = R;
    }

    //• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        Juego Game = new Juego();
        Game.getJugadores();
        Game.getR();

    }

//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
    public boolean ronda(int i) {
        boolean juegoSigue = true;
        jugadores.get(i).disparo(R);
     
        if (jugadores.get(i).isMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;

    }

}
