package Paquete1;

public class Gato {
    private double energia;
    private double velocidad;
    private double posicion;

    public double getPosicion() {
        return posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad() {
        this.velocidad=(getEnergia()/10)+5;
    }

    public boolean puedeAtraparJerry(Raton jerry) { //Se le pasa un objeto jerry sobre el cual va a comparara valores
        return velocidad > jerry.getVelocidad();//es true si
    }

    public void  correrJerry (Raton jerry){
        this.energia= getEnergia()- (0.5*getVelocidad()*(jerry.getPosicion()- getPosicion()));
        this.posicion=jerry.getPosicion();
    }
}
