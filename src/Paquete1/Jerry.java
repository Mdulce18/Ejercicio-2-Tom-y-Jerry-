package Paquete1;

public class Jerry {
    private double peso;
    private double velocidad;

    public Jerry (double peso){
        this.peso = peso;
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
