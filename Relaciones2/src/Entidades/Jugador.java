//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
package Entidades;

public class Jugador {

    private Integer ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer ID, String nombre, boolean mojado) {
        this.ID = ID;
        String ids = ID.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

//   Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo(Revolver R) {
        boolean disparo = false;

        if (R.mojar()) {
            mojado = true;
            disparo = true;

        } else {
            mojado = false;
        }

        R.siguienteChorro();
        return disparo;

    }

}
