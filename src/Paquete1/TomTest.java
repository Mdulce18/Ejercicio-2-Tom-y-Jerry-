package Paquete1;

import junit.framework.TestCase;

public class TomTest extends TestCase {
    Gato tom1 = new Gato();
    Raton jerry1 = new Raton();

    public void setUp() {
    tom1.setEnergia(20);
    jerry1.setPeso(4);
    tom1.setPosicion(30);
    jerry1.setPosicion(34);
    tom1.setVelocidad();//Para que se haga el calculo con los datos pasados
    jerry1.setVelocidad();
    }

    public void testvelodicadGato(){
        assertTrue(tom1.getVelocidad()==7);
    }

    public void testAtraparAJerry(){
        assertTrue(tom1.puedeAtraparJerry(jerry1));
    }

    public void testAtraparAJerry2(){ //Falla ya que tom no tiene energia suficiente para atraparta a jerry
        tom1.setEnergia(10);//asi que le pongo false
        tom1.setVelocidad();
        assertFalse(tom1.puedeAtraparJerry(jerry1));
    }

    public void testCorrerJerry(){//que tom está en el km 30 y jerry en el km 34, al correrlo a jerry pasan dos cosas:
        // la energía de tom queda en 6, y su posición actual el km 34.
        tom1.correrJerry(jerry1);
        assertTrue(tom1.getEnergia()==6);
        assertTrue(tom1.getPosicion()==34);

    };

}

