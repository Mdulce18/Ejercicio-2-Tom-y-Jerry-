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
        return this.velocidad > jerry.getVelocidad();//es true si
    }

    public void  correrJerry (Raton jerry){ //El consumo de energía es 0.5 *  su velocidad * distancia entre ambos.
        // Además su posición actual pasa a ser igual a la del ratón.
        this.energia= getEnergia()- (0.5*getVelocidad()*(jerry.getPosicion()- getPosicion()));
        this.posicion=jerry.getPosicion();
    }
}