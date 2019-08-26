package Paquete1;

import junit.framework.TestCase;

public class TomTest extends TestCase {
    Tom tom1 = new Tom();
    Jerry jerry1 = new Jerry();

    public void setUp() {
    tom1.setEnergia(20);
    jerry1.setPeso(4);
    tom1.setVelocidad();//Para que se haga el calculo con los datos pasados
    jerry1.setVelocidad();
    }

    public void testAtraparAJerry(){
        assertTrue(tom1.puedeAtraparJerry(jerry1));
    }



}

