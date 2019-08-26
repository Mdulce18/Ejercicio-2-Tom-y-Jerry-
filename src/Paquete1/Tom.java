package Paquete1;

public class Tom {
    private double energia;
    private double velocidad;

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

    public boolean puedeAtraparJerry(Jerry jerry) { //Se le pasa un objeto jerry sobre el cual va a comparara valores
        return velocidad > jerry.getVelocidad();//es true si
    }
}
