package Entidades;

public class Revolver {

    private double posicionActual;
    private double posicionAgua;

    public Revolver() {
    }

    public Revolver(double posicionActual, double posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public double getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(double posicionActual) {
        this.posicionActual = posicionActual;
    }

    public double getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(double posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //-----METODOS
    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios. mathramdom
    public void llenarRevolver() {

        posicionActual = Math.random() * 6 + 1;
        posicionAgua = Math.random() * 6 + 1;
        System.out.println(posicionAgua);
        System.out.println(posicionActual);
    }

//• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        boolean mojo = false;
        if (posicionAgua == posicionActual) {
            mojo = true;

        }
        return mojo;
    }

//• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
 if (posicionActual==6) {
            posicionActual=1;
        }else
            posicionActual++;
    }
      

//• toString(): muestra información del revolver (posición actual y donde está el agua) 
    public void toStringe() {
        System.out.println("Revolver{" + "posicionActual = " + posicionActual + ", posicionAgua = " + posicionAgua);
    }

}
