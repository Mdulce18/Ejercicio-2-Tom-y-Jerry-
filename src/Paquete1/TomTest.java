package Paquete1;

import junit.framework.TestCase;

public class TomTest extends TestCase {
    Gato tom1 = new Gato();
    Raton jerry1 = new Raton();

    public void setUp() {
    tom1.setEnergia(20);
    jerry1.setPeso(4);
    tom1.setVelocidad();//Para que se haga el calculo con los datos pasados
    jerry1.setVelocidad();
    }

    public void testAtraparAJerry(){
        assertTrue(tom1.puedeAtraparJerry(jerry1));
    }

    public void testAtraparAJerry2(){ //Falla ya que tom no tiene energia suficiente para atraparta a jerry
        tom1.setEnergia(10);//asi que le pongo false
        tom1.setVelocidad();
        assertFalse(tom1.puedeAtraparJerry(jerry1));
    }



}

