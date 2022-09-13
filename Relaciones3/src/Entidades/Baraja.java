package Entidades;

import java.util.ArrayList;

public class Baraja {

    ArrayList<Carta> mazo;
    ArrayList<Carta> pozo;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo, ArrayList<Carta> pozo) {
        this.mazo = mazo;
        this.pozo = pozo;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getPozo() {
        return pozo;
    }

    public void setPozo(ArrayList<Carta> pozo) {
        this.pozo = pozo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + ", pozo=" + pozo + '}';
    }

}
