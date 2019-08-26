package Paquete1;

public class Raton {
    private double peso;
    private double velocidad;
    private double posicion;

    public double getPosicion() {
        return posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setVelocidad(){
        this.velocidad =(10 - getPeso());
    }

    public double getVelocidad() {
        return velocidad;
    }
}
